//세개의 정수값을 구하고 최댓값을 구하여 출력

import java.util.Scanner;
public class Max3 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        System.out.println("세 정수의 최댓값을 구합니다.");
        System.out.print("a :"); int a = stdIn.nextInt();
        System.out.print("b :"); int b = stdIn.nextInt();
        System.out.print("c :"); int c = stdIn.nextInt();

        int max = a;
        if (b > max) max = b;
        if (c > max) max = c;

        System.out.print("max :"+ max);

    }
}
