// For the given array of Strings, print the largest string.

package Array;

public class Largest_String {
    public static String largestString(String[] arr) {
        String str = "";
        for (String s : arr) {
            if (s.length() > str.length()) {
                str = s;
            }
        }
        return str;
    }

    public static void main(String[] args) {
        String[] arr = { "java", "maths", "python", "programming", "study", "hard", "focus" };
        String largest = largestString(arr);
        System.out.println("The Largest String amoung array is: " + largest);
    }
}
