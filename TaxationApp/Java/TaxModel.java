package eecs1022.lab2;

/**
 * Created by umaragraw on 1/25/18.
 */

public class TaxModel {

    private Filer filer;

    public static final double sBRACKET_0 = 8350.0;
    public static final double sBRACKET_1 = 33950.0;
    public static final double sBRACKET_2 = 82250.0;

    public static final double mBRACKET_0 = 16700.0;
    public static final double mBRACKET_1 = 67900.0;
    public static final double mBRACKET_2 = 137050.0;

    public static final double hBRACKET_0 = 11950.0;
    public static final double hBRACKET_1 = 45500.0;
    public static final double hBRACKET_2 = 117450.0;

    public static final double RATE_0 = 10.0 / 100.0;
    public static final double RATE_1 = 15.0 / 100.0;
    public static final double RATE_2 = 25.0 / 100.0;
    public static final double RATE_3 = 30.0 / 100.0;

    
    public void setFiler(Filer filer){
        this.filer = filer;
    }

    public String getResponse (){
        String message = "\nCalculation is based on the scheme of " + filer.getStatus() + " Filing:";
        
        double income = filer.getIncome();
        double totalTax = 0.00;

        String outputMessage = filer.getName() + ", your tax due is ";


        if(filer.getBracket() == 4){

            if (filer.getStatus().equals("Single")){


                double part1 = sBRACKET_0 * TaxModel.RATE_0;
                message += "\nPart I: " + part1;
                income = income - sBRACKET_0;
                totalTax += part1;


                double part2 = (sBRACKET_1 - sBRACKET_0) * TaxModel.RATE_1;
                message += "\nPart II: " + part2;
                income = income - sBRACKET_1;
                totalTax += part2;


                double part3 = (sBRACKET_2 - sBRACKET_1) * TaxModel.RATE_2;
                message += "\nPart III: " + part3;
                income = income - sBRACKET_2;
                totalTax += part3;


                double part4 = (filer.getIncome() - sBRACKET_2) * TaxModel.RATE_3;
                message += "\nPart IV: " + part4;
                totalTax += part4;


            }

            else if (filer.getStatus().equals("Married")){

                double part1 = income * TaxModel.RATE_0;
                message += "\nPart I: " + part1;
                income = income - mBRACKET_0;
                totalTax += part1;


                double part2 = income * TaxModel.RATE_1;
                message += "\nPart II: " + part2;
                income = income - mBRACKET_1;
                totalTax += part2;


                double part3 = income * TaxModel.RATE_2;
                message += "\nPart III: " + part3;
                income = income - mBRACKET_2;
                totalTax += part3;


                double part4 = income * TaxModel.RATE_3;
                message += "\nPart IV: " + part4;
                totalTax += part4;

            }
            else if (filer.getStatus().equals("Household")){

                double part1 = income * TaxModel.RATE_0;
                message += "\nPart I: " + part1;
                income = income - hBRACKET_0;
                totalTax += part1;


                double part2 = income * TaxModel.RATE_1;
                message += "\nPart II: " + part2;
                income = income - hBRACKET_1;
                totalTax += part2;


                double part3 = income * TaxModel.RATE_2;
                message += "\nPart III: " + part3;
                income = income - hBRACKET_2;
                totalTax += part3;


                double part4 = income * TaxModel.RATE_3;
                message += "\nPart IV: " + part4;
                totalTax += part4;

            }

            outputMessage += totalTax + message;
        }

        else if(filer.getBracket() == 3){

            if (filer.getStatus().equals("Single")){

                double part1 = income * TaxModel.RATE_0;
                message += "\nPart I: " + part1;
                income = income - sBRACKET_0;
                totalTax += part1;


                double part2 = income * TaxModel.RATE_1;
                message += "\nPart II: " + part2;
                income = income - sBRACKET_1;
                totalTax += part2;


                double part3 = income * TaxModel.RATE_2;
                message += "\nPart III: " + part3;
                income = income - sBRACKET_2;
                totalTax += part3;

            }
            else if (filer.getStatus().equals("Married")){

                double part1 = income * TaxModel.RATE_0;
                message += "\nPart I: " + part1;
                income = income - mBRACKET_0;
                totalTax += part1;


                double part2 = income * TaxModel.RATE_1;
                message += "\nPart II: " + part2;
                income = income - mBRACKET_1;
                totalTax += part2;


                double part3 = income * TaxModel.RATE_2;
                message += "\nPart III: " + part3;
                income = income - mBRACKET_2;
                totalTax += part3;

            }
            else if (filer.getStatus().equals("Household")){

                double part1 = income * TaxModel.RATE_0;
                message += "\nPart I: " + part1;
                income = income - hBRACKET_0;
                totalTax += part1;


                double part2 = income * TaxModel.RATE_1;
                message += "\nPart II: " + part2;
                income = income - hBRACKET_1;
                totalTax += part2;


                double part3 = income * TaxModel.RATE_2;
                message += "\nPart III: " + part3;
                income = income - hBRACKET_2;
                totalTax += part3;

            }

            outputMessage += totalTax + message;
        }

        else if(filer.getBracket() == 2){

            if (filer.getStatus().equals("Single")){

                double part1 = income * TaxModel.RATE_0;
                message += "\nPart I: " + part1;
                income = income - sBRACKET_0;
                totalTax += part1;


                double part2 = income * TaxModel.RATE_1;
                message += "\nPart II: " + part2;
                income = income - sBRACKET_1;
                totalTax += part2;

            }
            else if (filer.getStatus().equals("Married")){

                double part1 = income * TaxModel.RATE_0;
                message += "\nPart I: " + part1;
                income = income - mBRACKET_0;
                totalTax += part1;


                double part2 = income * TaxModel.RATE_1;
                message += "\nPart II: " + part2;
                income = income - mBRACKET_1;
                totalTax += part2;

            }
            else if (filer.getStatus().equals("Household")){

                double part1 = income * TaxModel.RATE_0;
                message += "\nPart I: " + part1;
                income = income - hBRACKET_0;
                totalTax += part1;


                double part2 = income * TaxModel.RATE_1;
                message += "\nPart II: " + part2;
                income = income - hBRACKET_1;
                totalTax += part2;

            }

            outputMessage += totalTax + message;
        }

        else if(filer.getBracket() == 1){

            if (filer.getStatus().equals("Single")){

                double part1 = income * TaxModel.RATE_0;
                message += "\nPart I: " + part1;
                income = income - sBRACKET_0;
                totalTax += part1;

            }
            else if (filer.getStatus().equals("Married")){

                double part1 = income * TaxModel.RATE_0;
                message += "\nPart I: " + part1;
                income = income - mBRACKET_0;
                totalTax += part1;

            }
            else if (filer.getStatus().equals("Household")){

                double part1 = income * TaxModel.RATE_0;
                message += "\nPart I: " + part1;
                income = income - hBRACKET_0;
                totalTax += part1;

            }

            outputMessage += totalTax + message;
        }

        return outputMessage;
    }

    }