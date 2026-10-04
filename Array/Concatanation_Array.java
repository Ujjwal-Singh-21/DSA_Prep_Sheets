// https://leetcode.com/problems/concatenation-of-array/

package Array;

public class Concatanation_Array {
    public static int[] concatanationArray(int[] arr) {
        int[] ans = new int[2 * arr.length];
        for (int i = 0; i < ans.length; i++) {
            if (i < arr.length) {
                ans[i] = arr[i];
            } else {
                ans[i] = arr[i - arr.length];
            }
        }
        return ans;
    }

    public static void printArray(int[] arr) {
        for (int x : arr) {
            System.out.print(x + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = { 2, 1, 3, 5 };
        int[] res = concatanationArray(arr);
        System.out.print("The Original Array is: ");
        printArray(arr);
        System.out.println();
        System.out.print("The Resultant array is: ");
        printArray(res);
    }
}
