package introductory;

import java.util.Scanner;

public class WeirdAlgorithm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        StringBuilder sb = new StringBuilder(n + " ");
        while(n > 1){
            if(n % 2 == 0){
                n /= 2;
            }else{
                n *= 3;
                n++;
            }
            sb.append(n + " ");
        }
        System.out.println(sb);
    }
}
