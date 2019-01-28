package eecs1022.lab3;

/**
 * Created by umaragraw on 2/8/18.
 */

public class Player {

    // Attributes

    private String name;
    private String optionRound1;
    private String optionRound2;
    private String optionRound3;
    private int score;

    Player(){
        this.name="";
        this.optionRound1="";
        this.optionRound2="";
        this.optionRound3="";
        this.score=0;
    }

    public void resetGame(){
        this.name="";
        this.optionRound1="";
        this.optionRound2="";
        this.optionRound3="";
        this.score=0;
    }



    @Override
    public String toString(){
        String result = "";

        result = "New Game Started. \n Enter names of players.";

        return result;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOptionRound1() {
        return optionRound1;
    }

    public void setOptionRound1(String optionRound1) {
        this.optionRound1 = optionRound1;
    }

    public String getOptionRound2() {
        return optionRound2;
    }

    public void setOptionRound2(String optionRound2) {
        this.optionRound2 = optionRound2;
    }

    public String getOptionRound3() {
        return optionRound3;
    }

    public void setOptionRound3(String optionRound3) {
        this.optionRound3 = optionRound3;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

}
