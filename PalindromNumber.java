import java.util.Scanner;

public class PalindromNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your Number : ");
        int a = scanner.nextInt();
        int orgNumber = a;
        int rev = 0;

        while(a > 0){
            int last = a % 10;
            rev = last + rev * 10;
            a = a / 10;
        }

        if (orgNumber == rev){
            System.out.println(rev + " This is palindrome Number");
        }else {
            System.out.println(rev + " This is not Palindrome number!!");
        }

    }
}
