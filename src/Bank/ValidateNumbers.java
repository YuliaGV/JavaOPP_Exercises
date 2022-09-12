package Bank;

public class ValidateNumbers {

    public static boolean isNum(String input){
        try{
            int number = Integer.parseInt(input);
            return true;

        }catch(NumberFormatException error){
            System.out.println(error);
            return false;
        }
    }
}
