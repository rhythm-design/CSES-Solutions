package introductory;

import java.util.Scanner;

public class IncreasingArray {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long[] nums = new long[n];

        for(int i = 0; i < nums.length; i++){
            nums[i] = scanner.nextInt();
        }

        IncreasingArray increasingArray = new IncreasingArray();
        long moves = increasingArray.increasingMoves(nums);

        System.out.println(moves);
    }

    private long increasingMoves(long[] nums){
        long moves = 0;
        for(int i = 1; i < nums.length; i++){
            long prev = nums[i - 1];
            long curr = nums[i];
            if(curr < prev){
                long difference = prev - curr;
                moves += difference;
                nums[i] += difference;
            }
        }
        return moves;
    }
}
