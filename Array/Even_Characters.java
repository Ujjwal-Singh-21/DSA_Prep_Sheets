// For the given array of Strings, 
// print and count all the Strings which has even number of characters.

package Array;

public class Even_Characters {
    public static int countEvenCharacters(String[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            String str = arr[i];
            if (str.length() % 2 == 0) {
                count++;
                System.out.println(str);
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String[] arr = { "java", "maths", "python", "programming", "study", "hard", "focus" };
        int count = countEvenCharacters(arr);
        System.out.println("String having even number of characters : " + count);
    }
}
