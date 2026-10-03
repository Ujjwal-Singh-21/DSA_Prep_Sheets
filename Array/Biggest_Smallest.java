// Print biggest element , smallest elements and their difference from the given array.

package Array;

public class Biggest_Smallest {
    public static int biggestElement(int[] arr) {
        int biggest = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > biggest) {
                biggest = arr[i];
            }
        }
        return biggest;
    }

    public static int smallestElement(int[] arr) {
        int smallest = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < smallest) {
                smallest = arr[i];
            }
        }
        return smallest;
    }

    public static void main(String[] args) {
        int[] arr = { 10, 20, 30, 40, 55, 85, 5 };
        int biggest = biggestElement(arr);
        int smallest = smallestElement(arr);
        System.out.print("The Biggest Element of the given array is: " + biggest);
        System.out.println();
        System.out.print("The Smallest Element of the given array is: " + smallest);
        System.out.println();
        System.out.println("The Difference between them is: " + (biggest - smallest));
    }
}
