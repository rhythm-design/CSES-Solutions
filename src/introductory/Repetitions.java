package introductory;

import java.util.Scanner;

public class Repetitions {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        int longestLength = 1;
        int currentMaxLength = 1;

        for(int i = 1; i < str.length(); i++){
            char current = str.charAt(i);
            char prev = str.charAt(i - 1);
            if(prev == current){
                currentMaxLength++;
                longestLength = Math.max(longestLength, currentMaxLength);
            }else{
                currentMaxLength = 1;
            }
        }
        System.out.println(longestLength);
    }
}
