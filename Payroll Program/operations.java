// Programmer's name:   Linh Cao
// Email address:       linhcao@csu.fullerton.edu
// Course:              CPSC 223j
// Assignment number:   2
// Due date:            Sept 28, 2015
// Title:               Payroll User Interface
// Purpose:             Performing the basic payroll calculations
// This file name:      operations.java




public class operations {
    private static final int hour_per_week = 40;
    private static final double empl_insurance_price = 28.75;
    private static final double depend_insurance_price = 17.35;
    private static final double max_fica = 55.0;
    
    // calculate gross pay
    public static double grosspay(double rate, int hours){
        if(hours > hour_per_week){
            int extra = hours - hour_per_week;
            return hours * rate + 0.5*(extra*rate);
        } else{
            return hours * rate;
        }      
        
    }
    
    // calculate fed tax
    public static double fedtax(double grosspay){
        if(grosspay > 300){
            return 0.22*grosspay;
        } else{
            return 0;
        }
    }
    
    // calculate insurance cost
    public static double healthinsurance(int depend){
        if (depend == 0){
            return empl_insurance_price;
        } else {
            return empl_insurance_price + depend*depend_insurance_price;
        }
    }
    
    // calculate fica
    public static double fica(double gross){
        double pay;
        pay = 0.85 * gross;
        if(pay < max_fica){
            return pay;
        } else{
            return max_fica;
        }
    }
    
    // calculate net pay
    public static double netpay(double grosspay, double fedtax, double insurance, double fica){
        return grosspay - fedtax - insurance - fica;
    }
    
    // This function will check if input is an integer or not
    public static boolean isInt(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException nfe) {}
        return false;
    }// end isInt
    
    // This function will check if input is a double or not
    public static boolean isDouble(String str) {
        char[] temp = str.toCharArray();
        for(char c:temp){
            if(!Character.isDigit(c) && c!='.'){
                return false;
            }
        }
        try {
            Double.parseDouble(str);
            return true;
        } catch (NumberFormatException nfe) {}
        return false;
    }// end isDouble
    
    
    // This function will check if a string contain only letter
    public static boolean onlyLetter(String str){
        char[] temp = str.toCharArray();
        for(char c:temp){
            if(!Character.isLetter(c) && c!=' '){
                return false;
            }
        }
        return true;
    }
    
}
