package utils;

import utils.Input;

public class InputTest {

    public static void main(String[] args) {
        Input input = new Input();
        int num;
//        input.getString();
//        input.yesNo();
//        input.getDouble();
//        input.getDouble(3,10);
//        input.getInt();
//        input.getInt(7,15);
        try{
            num = input.getInt("Enter integer: ");
        }catch (Exception e){
            System.out.println("You must enter a numeric value\n"+e.getMessage());
            try {
                num = input.getInt("Try entering a number again: ");
            }catch (Exception f){
                System.out.println(f.getMessage());
//                System.out.println(f.getStackTrace());
                e.printStackTrace();
            }
//
        }




    }
}