import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n < 100 || n > 999) {
            System.out.println("Invalid Input");
            return;
        }
        int ori=n;
        int fi=n/100;
        int mi=(n/10)%10;
        int la=n%10;
        int reve=la*100+mi*10+fi;
        if (ori == reve) {
            System.out.println("palindrome");
        } else {
            System.out.println("not palindrome");
        }
    }
}
