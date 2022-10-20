package java_CodeUP.day_1006;

import java.util.Scanner;

public class java_1024 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] input = sc.next().split("");
        int n = input.length;

        for(int i = 0; i < n ; i++){
            System.out.printf("\'%s\'\n",input[i]);
        }
    }

}
