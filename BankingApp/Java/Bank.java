package eecs1022.lab5;

public class Bank {

    Client[] clients = new Client[6];
    int numberOfClients;
    String messageSuccess = "Updated Balance of Clients: \n";
    String messageError = "";

    public Client[] getClients() {
        return clients;
    }

    public int getNumberOfClients() {
        return numberOfClients;
    }

    public void setNumberOfClients (int numberOfClients){this.numberOfClients = numberOfClients;}

    public String createAccount(String name, double balance){

        if(this.getNumberOfClients() <= 5){

            boolean nameCheck = false;

            for(int i = 0; i <= 5; i++) {

                if (clients[i] != null) {

                    Client c = clients[i];
                    String nameFromArray = c.getName();

                    if (nameFromArray.equals(name)) {
                        nameCheck = true;
                    }

                }

            }

            if(nameCheck == false){

                Client client = new Client(name, balance);

                if(client.getBalance() >= 0){
                    clients[this.getNumberOfClients()] = client;
                    this.setNumberOfClients(this.getNumberOfClients()+1);

                    messageSuccess += "                " + client.getName() + ": " + String.format("%.2f", client.getBalance()) + "\n";

                    return messageSuccess;
                }

                else {

                    messageError += "Error: Non-positive initial balance. \n";

                    return messageError;
                }

            }

            else {

                messageError += "Error: Client " + name + " already exists. \n" ;

                return messageError;
            }

        }

        else {

            messageError += "Error: Maximum number of clients reached. \n";

            return messageError;
        }

    }

    public String transaction(String serviceSelected, double amount, String fromClientName, String toClientName){

        Client fromClient = null;
        Client toClient = null;
        String message = "";

        for(int i = 0; i <= 5; i++){

            // finding to and from client

            if(clients[i] != null) {
                Client c = clients[i];
                String nameFromArray = c.getName();


                if (serviceSelected.equals("DEPOSIT")) {

                    if (nameFromArray.equals(toClientName)) {
                        toClient = c;
                    }

                } else if (serviceSelected.equals("WITHDRAW")) {

                    if (nameFromArray.equals(fromClientName)) {
                        fromClient = c;
                    }
                } else if (serviceSelected.equals("TRANSFER")) {

                    if (nameFromArray.equals(fromClientName)) {
                        fromClient = c;
                    }
                    else if (nameFromArray.equals(toClientName)) {
                        toClient = c;

                    }
                }
            }

        }

        // Adding transaction to Client's transaction history.

        if(serviceSelected.equals("DEPOSIT")){

            if(toClient == null){
                message = "Error: To-client " + toClientName + " does not exist.";
                return message;

            }
            else{

                if(amount <= 0){
                    message = "Error: Non-positive amount.";

                    return message;
                }

                String returnMessage = toClient.addTransaction(serviceSelected, amount);

                if(returnMessage != null){
                    return returnMessage;
                }

                toClient.setBalance(toClient.getBalance() + amount);
            }

        }
        else if(serviceSelected.equals("WITHDRAW")){

            if(fromClient == null){
                message = "Error: From-client " + fromClientName + " does not exist.";
                return message;

            }
            else{

                if(amount <= 0){
                    message = "Error: Non-positive amount.";

                    return message;
                }

                if(amount > fromClient.getBalance()){
                    message = "Error: Amount too large to withdraw.";

                    return message;
                }

                String returnMessage = fromClient.addTransaction(serviceSelected, amount);

                if(returnMessage != null){
                    return returnMessage;
                }

                fromClient.setBalance(fromClient.getBalance() - amount);
            }
        }

        else if(serviceSelected.equals("TRANSFER")){

            if(toClient == null){
                message = "Error: To-client " + toClientName + " does not exist.";

                return message;
            }

            else{

                if(amount <= 0){
                    message = "Error: Non-positive transfer value entered.";

                    return message;
                }

                String returnMessage = toClient.addTransaction("DEPOSIT", amount);

                if(returnMessage != null){
                    return returnMessage;
                }

                toClient.setBalance(toClient.getBalance() + amount);

            }

            if(fromClient == null){
                message = "Error: From-client " + fromClientName + " does not exist.";
                return message;

            }
            else{

                if(amount <= 0){
                    message = "Error: Non-positive amount.";

                    return message;
                }

                if(amount > fromClient.getBalance()){
                    message = "Error: Amount too large to withdraw.";

                    return message;
                }

                String returnMessage = fromClient.addTransaction("WITHDRAW", amount);

                if(returnMessage != null){
                    return returnMessage;
                }

                fromClient.setBalance(fromClient.getBalance() - amount);
            }

        }

        messageSuccess = "Updated Balance of Clients: \n";

        for(int i = 0; i <= 5; i++){

            if(clients[i] != null){

                messageSuccess += "                " + clients[i].getName() + ": " + String.format("%.2f", clients[i].getBalance()) + ". \n";

            }

        }

        return messageSuccess;
        
    }

    public String getTransactionHistory (String name){

        String message = "Statement of client " + name;
        boolean clientFound = false;

        for(int i = 0; i <= 5; i++){
            Client c = this.clients[i];

            if(c != null){
                String nameFromArray = c.getName();

                if(nameFromArray.equals(name)){

                    clientFound = true;

                    message += " (current balance: $" + String.format("%.2f", c.getBalance()) + ") \n";
                    Transaction[] history = c.getHistory();

                    for(int j = 0; j < history.length; j++){

                        if(history[j] != null){
                            message += "                Transaction " + history[j].getType() + ": $" + String.format("%.2f", history[j].getAmount()) + "\n";
                        }
                    }
                }

            }

        }

        if(clientFound == false){

            message = "Error: Client name does not exist.";

        }

        return message;
    }

}
