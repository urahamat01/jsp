package swing;

import java.util.Scanner;

public class CheckPassword {

    public static void main(String[] args) {
        //  Scanner UserName = new Scanner(String.in);
        String UserName = "urahamat@gmai.com";
        String Password = "123456";

        if (UserName.isEmpty() || Password.isEmpty()) {

            System.out.println("Entered your  password/username");

        } else {

            if (UserName.equals("urahamat@gmai.com") && Password.equals("123456")) {
                System.out.println("valid password");

            } else {
                System.out.println("not valid password");
            }
        }
    }

}
