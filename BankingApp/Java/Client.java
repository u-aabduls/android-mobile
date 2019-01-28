package eecs1022.lab5;

public class Client {

    String name;
    double balance;
    Transaction[] historyList = new Transaction[10];
    int numberOfTransactions;

    Client (String name, double balance){

        this.name = name;
        this.balance = balance;
        this.numberOfTransactions = 0;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Transaction[] getHistory() {
        return historyList;
    }

    public void setHistory(Transaction[] historyList) {
        this.historyList = historyList;
    }

    public int getNumberOfTransactions() {
        return numberOfTransactions;
    }

    public void setNumberOfTransactions(int numberOfTransactions) {
        this.numberOfTransactions = numberOfTransactions;
    }

    public String addTransaction(String type, double amount){

        String message = null;
        Transaction history = new Transaction();
        history.setType(type);
        history.setAmount(amount);

        if(numberOfTransactions <= 9){
            historyList[numberOfTransactions] = history;
            numberOfTransactions++;
        }

        else {
            message = "Error: Maximum number of transactions reached.";
        }

        return message;

    }

}
