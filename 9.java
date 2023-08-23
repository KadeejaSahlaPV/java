//9. Write a Java Programming Code to Check given string Anagram or Not. If the two strings are anagram to each other, then one string can be rearranged to form the other string. For Example: abc and cba are anagram.
import java.util.Scanner;

class JavaProgram {
    public static void main(String[] input) {
        String str1, str2;
        int len, len1, len2, i, j, flag = 0;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter First String : ");
        str1 = scan.nextLine();
        System.out.print("Enter Second String : ");
        str2 = scan.nextLine();

        len1 = str1.length();
        len2 = str2.length();

        if (len1 == len2) {
            len = len1;
            for (i = 0; i < len; i++) {
                flag = 0;
                for (j = 0; j < len; j++) {
                    if (str1.charAt(i) == str2.charAt(j)) {
                        flag = 1;
                        break;
                    }
                }
                if (flag == 0) {
                    break;
                }
            }
            if (flag == 0) {
                System.out.print("Strings are not Anagram to Each Other..!!");
            } else {
                System.out.print("Strings are Anagram");
            }
        } else {
            System.out.print("Both Strings Must have the same number of Character to be an Anagram");
        }
    }
}
