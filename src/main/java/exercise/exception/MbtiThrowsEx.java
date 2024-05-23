package exercise.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MbtiThrowsEx {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try{
            System.out.println("=== MBTI 검사를 시작합니다 ===");
            checkEorI(scanner);
            System.out.println("=== mbti 검사가 종료되었습니다. ===");

            if(scanner!=null){
                scanner.close();
            }
        }catch (InputMismatchException e){
            System.out.println("키보드 입력이 잘못 되었습니다.");
        }
    }
    public static void checkEorI(Scanner scanner) throws InputMismatchException{
        System.out.println("1. 나는 밖에서 에너지를 얻는다.");
        System.out.println("2. 나는 이불속에서 에너지를 얻는다.");
        System.out.println("당신의 선택은?");
        int adsf = scanner.nextInt();
        System.out.println(adsf);
        if(adsf==1){
            System.out.println("당신 e");
        }else {
            System.out.println("당신 i");
        }
    }
}
