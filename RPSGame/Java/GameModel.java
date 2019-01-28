package eecs1022.lab3;

/**
 * Created by umaragraw on 2/10/18.
 */

public class GameModel {

    //private Player player1;
    //private Player player2;

    /*public void setPlayer(Player player){
        this.player = player;
    }*/

    // Game Rules

    /*GameModel(Player player1, Player player2){
        this.player1=player1;
        this.player2=player2;
    }*/

    public String roundOne(Player player1, Player player2) {

        String message = "";

        if (player1.getOptionRound1().equals("Paper") && player2.getOptionRound1().equals("Rock")) {

            message = "Round 1 finished: Winner is " + player1.getName() + ".";
            player1.setScore(player1.getScore()+1);

        }
        else if (player1.getOptionRound1().equals("Rock") && player2.getOptionRound1().equals("Scissors")) {

            message = "Round 1 finished: Winner is " + player1.getName() + ".";
            player1.setScore(player1.getScore()+1);

        }
        else if (player1.getOptionRound1().equals("Scissors") && player2.getOptionRound1().equals("Paper")) {

            message = "Round 1 finished: Winner is " + player1.getName() + ".";
            player1.setScore(player1.getScore()+1);

        }
        else if (player2.getOptionRound1().equals("Paper") && player1.getOptionRound1().equals("Rock")) {

            message = "Round 1 finished: Winner is " + player2.getName() + ".";
            player2.setScore(player2.getScore()+1);

        }
        else if (player2.getOptionRound1().equals("Rock") && player1.getOptionRound1().equals("Scissors")) {

            message = "Round 1 finished: Winner is " + player2.getName() + ".";
            player2.setScore(player2.getScore()+1);

        }
        else if (player2.getOptionRound1().equals("Scissors") && player1.getOptionRound1().equals("Paper")) {

            message = "Round 1 finished: Winner is " + player2.getName() + ".";
            player2.setScore(player2.getScore()+1);

        }
        else if (player1.getOptionRound1().equals("Paper") && player2.getOptionRound1().equals("Paper")) {

            message = "Round 1 finished: Tie between " + player1.getName() + " and " + player2.getName() + ".";

        }
        else if (player1.getOptionRound1().equals("Rock") && player2.getOptionRound1().equals("Rock")) {

            message = "Round 1 finished: Tie between " + player1.getName() + " and " + player2.getName() + ".";

        }
        else if (player1.getOptionRound1().equals("Scissors") && player2.getOptionRound1().equals("Scissors")) {

            message = "Round 1 finished: Tie between " + player1.getName() + " and " + player2.getName() + ".";

        }

        return message;


    }

    public String roundTwo(Player player1, Player player2) {


        String message = "";

        if (player1.getOptionRound2().equals("Paper") && player2.getOptionRound2().equals("Rock") && player1.getScore() == 0 && player2.getScore() == 0) {

            message = "Round 2 finished: Winner is " + player1.getName() + ".";
            player1.setScore(player1.getScore()+1);

        }
        else if (player1.getOptionRound2().equals("Rock") && player2.getOptionRound2().equals("Scissors") && player1.getScore() == 0 && player2.getScore() == 0) {

            message = "Round 2 finished: Winner is " + player1.getName() + ".";
            player1.setScore(player1.getScore()+1);

        }
        else if (player1.getOptionRound2().equals("Scissors") && player2.getOptionRound2().equals("Paper") && player1.getScore() == 0 && player2.getScore() == 0) {

            message = "Round 2 finished: Winner is " + player1.getName() + ".";
            player1.setScore(player1.getScore()+1);

        }
        else if (player2.getOptionRound2().equals("Paper") && player1.getOptionRound2().equals("Rock") && player1.getScore() == 0 && player2.getScore() == 0) {

            message = "Round 2 finished: Winner is " + player2.getName() + ".";
            player2.setScore(player2.getScore()+1);

        }
        else if (player2.getOptionRound2().equals("Rock") && player1.getOptionRound2().equals("Scissors")  && player1.getScore() == 0 && player2.getScore() == 0) {

            message = "Round 2 finished: Winner is " + player2.getName() + ".";
            player2.setScore(player2.getScore()+1);

        }
        else if (player2.getOptionRound2().equals("Scissors") && player1.getOptionRound2().equals("Paper") && player1.getScore() == 0 && player2.getScore() == 0) {

            message = "Round 2 finished: Winner is " + player2.getName() + ".";
            player2.setScore(player2.getScore()+1);

        }

        else if (player1.getOptionRound2().equals("Paper") && player2.getOptionRound2().equals("Rock") && player1.getScore() == 1) {

            message = "Round 2 finished: Winner is " + player1.getName() + ". \nGame is over.";
            player1.setScore(player1.getScore()+1);

        }
        else if (player1.getOptionRound2().equals("Rock") && player2.getOptionRound2().equals("Scissors") && player1.getScore() == 1) {

            message = "Round 2 finished: Winner is " + player1.getName() + ". \nGame is over.";
            player1.setScore(player1.getScore()+1);

        }
        else if (player1.getOptionRound2().equals("Scissors") && player2.getOptionRound2().equals("Paper") && player1.getScore() == 1) {

            message = "Round 2 finished: Winner is " + player1.getName() + ". \nGame is over.";
            player1.setScore(player1.getScore()+1);

        }
        else if (player2.getOptionRound2().equals("Paper") && player1.getOptionRound2().equals("Rock") && player2.getScore() == 1) {

            message = "Round 2 finished: Winner is " + player2.getName() + ". \nGame is over.";
            player2.setScore(player2.getScore()+1);

        }
        else if (player2.getOptionRound2().equals("Rock") && player1.getOptionRound2().equals("Scissors") && player2.getScore() == 1) {

            message = "Round 2 finished: Winner is " + player2.getName() + ". \nGame is over.";
            player2.setScore(player2.getScore()+1);

        }
        else if (player2.getOptionRound2().equals("Scissors") && player1.getOptionRound2().equals("Paper") && player2.getScore() == 1) {

            message = "Round 2 finished: Winner is " + player2.getName() + ". \nGame is over.";
            player2.setScore(player2.getScore()+1);

        }

        else if (player1.getOptionRound2().equals("Paper") && player2.getOptionRound2().equals("Rock") && player2.getScore() == 1) {

            message = "Round 2 finished: Tie between " + player1.getName() + " and " + player2.getName() + ".";
            player1.setScore(player1.getScore()+1);

        }

        else if (player1.getOptionRound2().equals("Rock") && player2.getOptionRound2().equals("Scissors") && player2.getScore() == 1) {

            message = "Round 2 finished: Tie between " + player1.getName() + " and " + player2.getName() + ".";
            player1.setScore(player1.getScore()+1);

        }

        else if (player1.getOptionRound2().equals("Scissors") && player2.getOptionRound2().equals("Paper") && player2.getScore() == 1) {

            message = "Round 2 finished: Tie between " + player1.getName() + " and " + player2.getName() + ".";
            player1.setScore(player1.getScore()+1);

        }

        else if (player2.getOptionRound2().equals("Paper") && player1.getOptionRound2().equals("Rock") && player1.getScore() == 1) {

            message = "Round 2 finished: Tie between " + player1.getName() + " and " + player2.getName() + ".";
            player2.setScore(player2.getScore()+1);

        }

        else if (player2.getOptionRound2().equals("Rock") && player1.getOptionRound2().equals("Scissors") && player1.getScore() == 1) {

            message = "Round 2 finished: Tie between " + player1.getName() + " and " + player2.getName() + ".";
            player2.setScore(player2.getScore()+1);

        }

        else if (player2.getOptionRound2().equals("Scissors") && player1.getOptionRound2().equals("Paper") && player1.getScore() == 1) {

            message = "Round 2 finished: Tie between " + player1.getName() + " and " + player2.getName() + ".";
            player2.setScore(player2.getScore()+1);

        }

        else if (player1.getOptionRound2().equals("Paper") && player2.getOptionRound2().equals("Paper")) {

            if (player1.getScore() > player2.getScore()){

                message = "Round 2 finished: Tie between " + player1.getName() + " and " + player2.getName() + ".";

            }

            else if (player1.getScore() < player2.getScore()){

                message = "Round 2 finished: Tie between " + player1.getName() + " and " + player2.getName() + ".";

            }

            else if (player1.getScore() == player2.getScore()){

                message = "Round 2 finished: Tie between " + player1.getName() + " and " + player2.getName() + ".";

            }
        }
        else if (player1.getOptionRound2().equals("Rock") && player2.getOptionRound2().equals("Rock")) {

            if (player1.getScore() > player2.getScore()){

                message = "Round 2 finished: Tie between " + player1.getName() + " and " + player2.getName() + ".";

            }

            else if (player1.getScore() < player2.getScore()){

                message = "Round 2 finished: Tie between " + player1.getName() + " and " + player2.getName() + ".";

            }

            else if (player1.getScore() == player2.getScore()){

                message = "Round 2 finished: Tie between " + player1.getName() + " and " + player2.getName() + ".";

            }

        }
        else if (player1.getOptionRound2().equals("Scissors") && player2.getOptionRound2().equals("Scissors")) {

            if (player1.getScore() > player2.getScore()){

                message = "Round 2 finished: Tie between " + player1.getName() + " and " + player2.getName() + ".";

            }

            else if (player1.getScore() < player2.getScore()){

                message = "Round 2 finished: Tie between " + player1.getName() + " and " + player2.getName() + ".";

            }

            else if (player1.getScore() == player2.getScore()){

                message = "Round 2 finished: Tie between " + player1.getName() + " and " + player2.getName() + ".";

            }

        }

        return message;
    }

    public String roundThree(Player player1, Player player2) {

        String message = "";

        if (player1.getOptionRound3().equals("Paper") && player2.getOptionRound3().equals("Rock") && player1.getScore() == 0 && player2.getScore() == 0) {

            message = "Round 3 finished: Winner is " + player1.getName() + ". \nGame is over.";


        } else if (player1.getOptionRound3().equals("Rock") && player2.getOptionRound3().equals("Scissors") && player1.getScore() == 0 && player2.getScore() == 0) {

            message = "Round 3 finished: Winner is " + player1.getName() + ". \nGame is over.";


        } else if (player1.getOptionRound3().equals("Scissors") && player2.getOptionRound3().equals("Paper") && player1.getScore() == 0 && player2.getScore() == 0) {

            message = "Round 3 finished: Winner is " + player1.getName() + ". \nGame is over.";


        } else if (player2.getOptionRound3().equals("Paper") && player1.getOptionRound3().equals("Rock") && player1.getScore() == 0 && player2.getScore() == 0) {

            message = "Round 3 finished: Winner is " + player2.getName() + ". \nGame is over.";


        } else if (player2.getOptionRound3().equals("Rock") && player1.getOptionRound3().equals("Scissors") && player1.getScore() == 0 && player2.getScore() == 0) {

            message = "Round 3 finished: Winner is " + player2.getName() + ". \nGame is over.";


        } else if (player2.getOptionRound3().equals("Scissors") && player1.getOptionRound3().equals("Paper") && player1.getScore() == 0 && player2.getScore() == 0) {

            message = "Round 3 finished: Winner is " + player2.getName() + ". \nGame is over.";


        } else if (player1.getOptionRound3().equals("Paper") && player2.getOptionRound3().equals("Rock") && player1.getScore() == 1 && player2.getScore() == 0) {

            message = "Round 3 finished: Winner is " + player1.getName() + ". \nGame is over.";


        } else if (player1.getOptionRound3().equals("Rock") && player2.getOptionRound3().equals("Scissors") && player1.getScore() == 1 && player2.getScore() == 0) {

            message = "Round 3 finished: Winner is " + player1.getName() + ". \nGame is over.";


        } else if (player1.getOptionRound3().equals("Scissors") && player2.getOptionRound3().equals("Paper") && player1.getScore() == 1 && player2.getScore() == 0) {

            message = "Round 3 finished: Winner is " + player1.getName() + ". \nGame is over.";


        } else if (player2.getOptionRound3().equals("Paper") && player1.getOptionRound3().equals("Rock") && player1.getScore() == 0 && player2.getScore() == 1) {

            message = "Round 3 finished: Winner is " + player2.getName() + ". \nGame is over.";


        } else if (player2.getOptionRound3().equals("Rock") && player1.getOptionRound3().equals("Scissors") && player1.getScore() == 0 && player2.getScore() == 1) {

            message = "Round 3 finished: Winner is " + player2.getName() + ". \nGame is over.";


        } else if (player2.getOptionRound3().equals("Scissors") && player1.getOptionRound3().equals("Paper") && player1.getScore() == 0 && player2.getScore() == 1) {

            message = "Round 3 finished: Winner is " + player2.getName() + ". \nGame is over.";


        } else if (player1.getOptionRound3().equals("Paper") && player2.getOptionRound3().equals("Rock") && player1.getScore() == 1 && player2.getScore() == 1) {

            message = "Round 3 finished: Winner is " + player1.getName() + ". \nGame is over.";


        } else if (player1.getOptionRound3().equals("Rock") && player2.getOptionRound3().equals("Scissors") && player1.getScore() == 1 && player2.getScore() == 1) {

            message = "Round 3 finished: Winner is " + player1.getName() + ". \nGame is over.";


        } else if (player1.getOptionRound3().equals("Scissors") && player2.getOptionRound3().equals("Paper") && player1.getScore() == 1 && player2.getScore() == 1) {

            message = "Round 3 finished: Winner is " + player1.getName() + ". \nGame is over.";


        } else if (player2.getOptionRound3().equals("Paper") && player1.getOptionRound3().equals("Rock") && player1.getScore() == 1 && player2.getScore() == 1) {

            message = "Round 3 finished: Winner is " + player2.getName() + ". \nGame is over.";


        } else if (player2.getOptionRound3().equals("Rock") && player1.getOptionRound3().equals("Scissors") && player1.getScore() == 1 && player2.getScore() == 1) {

            message = "Round 3 finished: Winner is " + player2.getName() + ". \nGame is over.";


        } else if (player2.getOptionRound3().equals("Scissors") && player1.getOptionRound3().equals("Paper") && player1.getScore() == 1 && player2.getScore() == 1) {

            message = "Round 3 finished: Winner is " + player2.getName() + ". \nGame is over.";


        } else if (player1.getOptionRound3().equals("Paper") && player2.getOptionRound3().equals("Paper")) {

            if (player1.getScore() > player2.getScore()) {

                message = "Round 3 finished: Winner is " + player1.getName() + ". \nGame is over.";

            } else if (player1.getScore() < player2.getScore()) {

                message = "Round 3 finished: Winner is " + player2.getName() + ". \nGame is over.";

            } else if (player1.getScore() == player2.getScore()) {

                message = "Round 3 finished: Tie between " + player1.getName() + " and " + player2.getName() + ". \nGame is over.";

            }

        } else if (player1.getOptionRound3().equals("Rock") && player2.getOptionRound3().equals("Rock")) {

            if (player1.getScore() > player2.getScore()) {

                message = "Round 3 finished: Winner is " + player1.getName() + ". \nGame is over.";

            } else if (player1.getScore() < player2.getScore()) {

                message = "Round 3 finished: Winner is " + player2.getName() + ". \nGame is over.";

            } else if (player1.getScore() == player2.getScore()) {

                message = "Round 3 finished: Tie between " + player1.getName() + " and " + player2.getName() + ". \nGame is over.";

            }


        } else if (player1.getOptionRound3().equals("Scissors") && player2.getOptionRound3().equals("Scissors")) {

            if (player1.getScore() > player2.getScore()) {

                message = "Round 3 finished: Winner is " + player1.getName() + ". \nGame is over.";

            } else if (player1.getScore() < player2.getScore()) {

                message = "Round 3 finished: Winner is " + player2.getName() + ". \nGame is over.";

            } else if (player1.getScore() == player2.getScore()) {

                message = "Round 3 finished: Tie between " + player1.getName() + " and " + player2.getName() + ". \nGame is over.";

            }


        }

        return message;
    }
}
