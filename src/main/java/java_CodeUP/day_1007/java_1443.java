package java_CodeUP.day_1007;

import java.util.Scanner;

public class java_1443 {

    public int[] sort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = tmp;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int[] arr = new int[input];

        for(int i = 0 ; i< input ; i++){
            arr[i] = sc.nextInt();
        }

        java_1443 j = new java_1443();
        j.sort(arr);
        for (int a:arr
             ) {
            System.out.println(a);
        }
    }
}
