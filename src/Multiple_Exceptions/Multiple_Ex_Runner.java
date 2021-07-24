package Multiple_Exceptions;

import java.io.IOException;
import java.text.ParseException;

public class Multiple_Ex_Runner {
    public static void main(String[] args) {
        Multiple_Ex muEx= new Multiple_Ex();
//        try{
//            muEx.start();
//        }catch(IOException | ParseException e){
//            System.out.println(e.getStackTrace());
//        }
        //OR
        try{
            muEx.start();
        }catch(IOException e){
            System.out.println(e.getStackTrace());
        }catch(ParseException e){
            System.out.println(e.getStackTrace());
        }

        // If you have child exception(any exception that extends
        // Exception, handle it first before handling the parent exception
        // There are 2 kinds of exceptions in JAVA. They are Unchecked(Runtime) and Checked Exceptions
        // NullPointerException is a runtime exception you should check
        // Dividing a number by 0 results in a runtime exception
        // IndexOutOfBounds is also a runtime exception
        // For runtime exceptions, you are not forced to handle it, but you have to handle it
        // nonetheless



    }
}
