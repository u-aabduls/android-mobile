package eecs1022.lab5;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class Lab5Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lab5);
    }

    // Creation of Bank object.

    Bank bank = new Bank();

    // Retrieval of user inputs.

    private String getInputOfTextField (int id) {
        View view = findViewById(id);
        EditText editText = (EditText) view;
        String input = editText.getText().toString();
        return input;
    }

    // Retrieval of selected spinner option.

    private String getItemSelected(int id){
        View view = findViewById(id);
        Spinner spinner = (Spinner) view;
        String string = spinner.getSelectedItem().toString();
        return string;
    }

    // Setting of output values in result.

    private void setContentsOfTextView (int id, String newContents){
        View view = findViewById(id);
        TextView textView = (TextView) view;
        textView.setText(newContents);
    }

    // Creation of Client Account

    public void buttonCreateAccountClicked (View view){

        String name = ((EditText) findViewById(R.id.clientName)).getText().toString();

        String stringBalance = ((EditText) findViewById(R.id.clientBalance)).getText().toString();
        double balance = Double.parseDouble(stringBalance);

        setContentsOfTextView(R.id.transactionHistory, bank.createAccount(name, balance));

    }

    // Client Transactions

    public void buttonCompleteTransactionClicked (View view){

        String serviceSelected = getItemSelected(R.id.spinnerTransaction);

        String stringAmount = ((EditText) findViewById(R.id.transactionAmount)).getText().toString();
        double amount = Double.parseDouble(stringAmount);

        String fromClientName = ((EditText) findViewById(R.id.fromClient)).getText().toString();

        String toClientName = ((EditText) findViewById(R.id.toClient)).getText().toString();

        setContentsOfTextView(R.id.transactionHistory, bank.transaction(serviceSelected, amount, fromClientName, toClientName));

    }

    // Client Transaction History

    public void buttonTransactionHistoryClicked (View view){

        String name = ((EditText) findViewById(R.id.clientNameSearch)).getText().toString();

        setContentsOfTextView(R.id.transactionHistory, bank.getTransactionHistory(name));

    }


}
