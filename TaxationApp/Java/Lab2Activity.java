package eecs1022.lab2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;

public class Lab2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lab2);
    }

    private String getInputOfTextField (int id) {
        View view = findViewById(id);
        EditText editText = (EditText) view;
        String input = editText.getText().toString();
        return input;
    }

    private void setContentsOfTextView(int id, String newContents){
        View view = findViewById(id);
        TextView textView = (TextView) view;
        textView.setText(newContents);
    }

    private String getItemSelected(int id){
        View view = findViewById(id);
        Spinner spinner = (Spinner) view;
        String string = spinner.getSelectedItem().toString();
        return string;
    }


    public void ButtonClicked (View v)
    {
        // Grab UI field for filer
        String name = ((EditText) findViewById(R.id.name)).getText().toString();
        double income = Double.parseDouble(((EditText) findViewById(R.id.income)).getText().toString());
        String selectedItem = getItemSelected(R.id.statusSpinner);
        int bracket = 1;

        // Set bracket. 1 for first bracket, 2 for second bracket, 3 for third bracket, 4 for fourth bracket
        if (income > TaxModel.sBRACKET_2){
            bracket = 4;
        }
        else if (income > TaxModel.sBRACKET_1 && income <= TaxModel.sBRACKET_2 ){
            bracket = 3;
        }
        else if (income > TaxModel.sBRACKET_0 && income <= TaxModel.sBRACKET_1){
            bracket = 2;
        }
        if (income > 0 && income <= TaxModel.sBRACKET_0){
            bracket = 1;
        }

        //Build filer info
        Filer filer = new Filer();
        filer.setName(name);
        filer.setIncome(income);
        filer.setStatus(selectedItem);
        filer.setBracket(bracket);

        TaxModel model = new TaxModel();
        model.setFiler(filer);

        String response = model.getResponse();


        // fish out the linear layout widget
        // cast it to LinearLayout and call the obtained object output
        LinearLayout output = (LinearLayout) findViewById(R.id.result);
        output.removeAllViews();
        // 1

        TextView taxLabel2 = new TextView(this);
        taxLabel2.setText(response);
        output.addView(taxLabel2);


    }




}
