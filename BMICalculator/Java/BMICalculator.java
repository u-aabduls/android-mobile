package eecs1022.eecs1022w18lab1bmicalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class BMICalculator extends AppCompatActivity
{
    private EditText height;
    private EditText weight;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bmicalculator);
    }

    /* Helper method for changing contents from the GUI.  */

    private void setContentsOfTextView(int id, String newContents) {
        View view = findViewById(id);
        TextView textView = (TextView) view;
        textView.setText(newContents);

    }

    /* Helper method for retreiving contents from the GUI */

    private String getInputOfTextField(int id){
        View view = findViewById(id);
        EditText editText = (EditText) view;
        String input = editText.getText().toString();
        return input;

    }

    private String getItemSelected(int id) {
        View view = findViewById(id);
        Spinner spinner = (Spinner) view;
        String string = spinner.getSelectedItem().toString();
        return string;
    }




    public void Calculate (View v) {
        height = findViewById(R.id.height);
        weight = findViewById(R.id.weight);
        String heightstr = height.getText().toString();
        String weightstr = height.getText().toString();
        Float heightvalue = Float.parseFloat(heightstr);
        Float weightvalue = Float.parseFloat(weightstr);
        float bmi = weightvalue / (heightvalue *heightvalue);
        buttonClicked();







    }
    public void buttonClicked () {
        String range = "";
        height = findViewById(R.id.height);
        weight = findViewById(R.id.weight);
        String heightstr = height.getText().toString();
        String weightstr = height.getText().toString();
        float heightvalue = Float.parseFloat(heightstr);
        float weightvalue = Float.parseFloat(weightstr);
        float bmi = weightvalue / (heightvalue *heightvalue);

        if (bmi < 18.5) {
            range = "Underweight";

        } else if (bmi >= 18.5 && bmi < 25.0) {
            range = "Normal";

        } else if (bmi >= 25.0 && bmi < 30.0) {
            range = "Overweight";

        } else {
            range = "Obese";

        }
        View weightView = findViewById(R.id.weight);
        EditText weightEdit = (EditText) weightView;
        String weight = weightEdit.getText().toString();
        String height = ((EditText) findViewById(R.id.height)).getText().toString();

        Person model = new Person(weight, height);
        String selectedItem = getItemSelected(R.id.weightSpinner);
        String selectedItem2 = getItemSelected(R.id.heightSpinner);

        if(selectedItem.equals("pounds")){
            model.kgConversion();




        }
        if(selectedItem2.equals("inches")){
            model.metersConversion();

        }


        //String answer ="Your weight in pounds is" + model.getBMI();
        // "Your weight in pound is xxx and your BMI is xx.x".
        String textName = getInputOfTextField(R.id.name);
        String answer = textName + " has a BMI of " + model.getBMI() + "\n\n" + range;

        ((TextView) findViewById(R.id.calculation)).setText(answer);


    }




}
