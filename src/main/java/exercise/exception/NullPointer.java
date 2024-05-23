package exercise.exception;

import java.util.Scanner;

public class NullPointer {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.println("input: ");
            String str = scanner.nextLine();

            if (str.equals("q")) {
                System.out.println("quit");
                break;
            }

            try {

                int score = Integer.parseInt(str);

                if (score >= 60) {
                    System.out.println("pass");
                    continue;
                }

                System.out.println("fail");
            }
            catch(Exception e) {
                System.out.println("no");
            }
        }
    }
}
