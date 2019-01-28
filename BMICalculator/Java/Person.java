package eecs1022.eecs1022w18lab1bmicalculator;

/**
 * The Person class is a template for person entities.
 */

public class Person
{
    /*
        Attributes are data that we store to represent the STATE (i.e. combination of attribute values of each) of each entity.
     */

    /* Each decoration of an attribute consists of:
        1. the type of the attribute
        2. the name of the attribute
     */

   private double weight;
    private double height;


    public Person (String w, String h){
        this.weight = Double.parseDouble(w);
        this.height = Double.parseDouble(h);

    }

    public String getBMI () {
        double result = weight;
        double result2 = height;

        double result3 = result / (result2 * result2);
        String formattedString = String.format("%.2f", result3);

        return formattedString;

    }


    public double kgConversion() {
        double result= this.weight / 2.2;
        return result;


    }

    public double metersConversion() {
        double result = this.height / 39.37;
        return result;

    }

    public String getBMIPoundsAndInches (){
        double result = this.weight / (this.height * this.height);
        String formattedString = String.format("%.2f", result);

        return formattedString;

    }



}


