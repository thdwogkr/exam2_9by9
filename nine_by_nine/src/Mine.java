import java.util.Scanner;

public class Mine {
    public static void main(String[] args) {

        long num_min = 2;
        long num_max = 9;
        long square_num_min = 2;
        long square_num_max = 10;
        long result = 1;


        Scanner scanner = new Scanner(System.in);
        System.out.println("=".repeat(30));
        System.out.printf("(%d ~ %d)거듭제곱 구하기 (입력가능 범위 : %d~%d)",square_num_min,square_num_max,num_min,num_max);
        System.out.println("=".repeat(30));
        System.out.print("거듭제곱을 구할 숫자를 입력하세요 : ");
        long num = scanner.nextLong();
        System.out.println("");

        for(long i = 1 ; i<=square_num_min ; i++) {
            result = result * num;
        }

        System.out.printf("입력하신 숫자는 %d 입니다.%n",num);

        if(num>=num_min && num<=num_max) {
            for(long i = square_num_min ; i <= square_num_max ; i++) {
                System.out.printf("%d의 %d 제곱 = %,d%n",num,i,result);
                result = result * num;
            }

        }else {
            System.out.printf("입력 가능한 범위를 벗어났습니다. (%d~%d)",num_min,num_max);
        }





    }
}
