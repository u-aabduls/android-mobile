package eecs1022.lab6;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class lab6Activity extends AppCompatActivity
{
    Game game;

    String playerX;
    String playerO;

    String playFirst;
    String rowNum;
    String columnNum;



    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lab6);
        game = new Game();
    }


    private void setContentsOfTextView(int id, String newContents)
    {
        View view = findViewById(id);
        TextView textView = (TextView) view;
        textView.setText(newContents);
    }

    private String getInputOfTextField(int id)
    {
        View view = findViewById(id);
        EditText editText = (EditText) view;
        String input = editText.getText().toString();
        return input;
    }

    private String getItemSelected(int id)
    {
        View view = findViewById(id);
        Spinner spinner = (Spinner) view;
        String string = spinner.getSelectedItem().toString();
        return string;
    }

    public void buttonStart(View view){
        playerX = getInputOfTextField(R.id.playerX);
        playerO = getInputOfTextField(R.id.playerO);
        playFirst = getItemSelected(R.id.playerOp);


        game.players(playerX,playerO);
        game.playFirst(playFirst);
        game.intGameState();
        game.resetError();

        setContentsOfTextView(R.id.labelResult, game.toString());
    }

    public void buttonPlay(View view){
        rowNum = getItemSelected(R.id.spinnerRow);
        columnNum = getItemSelected(R.id.spinnerColumn);

        int row = Integer.parseInt(rowNum);
        int column = Integer.parseInt(columnNum);

        game.rowAndColumn(row, column);
        game.playerMoves();
        game.allResults();

        setContentsOfTextView(R.id.labelResult, game.toString());

    }

}
