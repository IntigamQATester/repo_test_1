import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
      String word="Java";
        System.out.println(reverse(word));
        String str = "";

    }


    public static boolean reverse(String str) {
        String input = new Scanner(System.in).nextLine();
        for (int i = input.length() - 1; i >= 0; i--) {

            str += input.charAt(i);
        }


        return false;
    }
    }
