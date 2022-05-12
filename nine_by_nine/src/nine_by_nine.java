import java.util.Scanner;


public class nine_by_nine {
    public static void main(String[] args) {

        int min_num = 2;
        int max_num = 9;
        int range = 9;

        Scanner scanner = new Scanner(System.in);
        System.out.printf("[안내]희망하는 구구단을 숫자로 입력해 주세요 (%d~%d) : ",min_num,max_num);
        int num = scanner.nextInt();

        System.out.println("");

        if( num >= min_num && num <= max_num ) {
            System.out.printf("%d 단 이 입력되었습니다.%n",num);
            for(int i = 1; i<=range ; i++){
                System.out.printf("%d * %d = %d%n",num,i,num*i);
            }
        } else {
            System.out.printf("%d 단 이 입력되었습니다.%n",num);
            System.out.println("[경고]구구단은 2단 ~ 9단 까지만 선택할 수 있습니다.");
            System.out.println("프로그램을 종료합니다.");
        }

        scanner.close();





    }

}
