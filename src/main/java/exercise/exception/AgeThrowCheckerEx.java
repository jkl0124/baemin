package exercise.exception;

import java.util.Scanner;

public class AgeThrowCheckerEx {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true) {
            try {
                int asdf = scanner.nextInt();
                if (asdf == -1)
                    break;
                if (asdf > 100 || asdf < 0)
                    throw new CustomException("0dptj 100까지 부탁드릴게요.");
                System.out.println("당신의 나이는 " + asdf + "살이시네요. 반갑습니다");
            } catch (CustomException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
