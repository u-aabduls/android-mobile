package eecs1022.lab3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class Lab3Activity extends AppCompatActivity {

    // Build Player info.

    Player player1 = new Player();
    Player player2 = new Player();
    GameModel model = new GameModel();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lab3);
        setContentsOfTextView(R.id.result, "    New game started. \n Enter names of players.");
    }

    // Retrieval of TextField contents.

    private String getInputOfTextField (int id) {
        View view = findViewById(id);
        EditText editText = (EditText) view;
        String input = editText.getText().toString();
        return input;
    }

    // Setting of TextView contents.

    private void setContentsOfTextView (int id, String newContents){
        View view = findViewById(id);
        TextView textView = (TextView) view;
        textView.setText(newContents);
    }

    // Retrieval of Spinner option value.

    private String getItemSelected(int id){
        View view = findViewById(id);
        Spinner spinner = (Spinner) view;
        String string = spinner.getSelectedItem().toString();
        return string;
    }


    // This method will be registered to the button with the id buttonRound1

    public void buttonRound1Clicked (View view) {

        // Grab UI field for Players
        String namePlayer1 = ((EditText) findViewById(R.id.player1Name)).getText().toString();
        String namePlayer2 = ((EditText) findViewById(R.id.player2Name)).getText().toString();
        String optionPlayer1Round1 = getItemSelected(R.id.spinnerRound1Player1);
        String optionPlayer2Round1 = getItemSelected(R.id.spinnerRound1Player2);

        player1.setName(namePlayer1);
        player2.setName(namePlayer2);

        player1.setOptionRound1(optionPlayer1Round1);
        player2.setOptionRound1(optionPlayer2Round1);



        setContentsOfTextView(R.id.result, model.roundOne(player1,player2));

    }

    // This method will be registered to the button with the id buttonRound2

    public void buttonRound2Clicked (View view){

        String optionPlayer1Round2 = getItemSelected(R.id.spinnerRound2Player1);
        String optionPlayer2Round2 = getItemSelected(R.id.spinnerRound2Player2);

        player1.setOptionRound2(optionPlayer1Round2);
        player2.setOptionRound2(optionPlayer2Round2);

        setContentsOfTextView(R.id.result, model.roundTwo(player1, player2));

    }

    // This method will be registered to the button with the id buttonRound3

    public void buttonRound3Clicked (View view){



        if (player1.getScore() == 2 || player2.getScore() == 2) {

            setContentsOfTextView(R.id.result, "Error: Game is already over.");

        }

        else {
            String optionPlayer1Round3 = getItemSelected(R.id.spinnerRound3Player1);
            String optionPlayer2Round3 = getItemSelected(R.id.spinnerRound3Player2);

            player1.setOptionRound3(optionPlayer1Round3);
            player2.setOptionRound3(optionPlayer2Round3);
            setContentsOfTextView(R.id.result, model.roundThree(player1, player2));
        }

    }

    // This method will be registered to the button with the id buttonNewGame

    public void buttonNewGameClicked (View view){

        player1.resetGame();
        player2.resetGame();
        setContentsOfTextView(R.id.result, "    New game started. \n Enter names of players.");


    }
}
