package exercise.exception;

import java.util.Scanner;

public class MultiCatchEx {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] cards = {1,2,3,4,5,6};
        System.out.println("몇번재 카드를 뽑을까요?");
        int cardIdx = scanner.nextInt();
        System.out.println("뽑은 카드에 적힌 숫자는 : " + cards[cardIdx]);
        int temp1 = scanner.nextInt();
        int temp2 = scanner.nextInt();
        int temp3 = divide(temp1,temp2);
        System.out.println(temp3);
    }

    public static int divide(int x,int y) throws ArithmeticException{

        return x/y;
    }
}
