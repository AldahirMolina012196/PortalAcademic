package co.com.tcs.training.test.web.academicportal.utils;

public class ConvertDouble {
    public static double convertValues(String value){
        double convertToDouble = 0;
        try{
            convertToDouble = Double.parseDouble(value);
        }catch (NumberFormatException e){

        }
        return convertToDouble;
    }
}
