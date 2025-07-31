import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        if (num<= 0 || num>1000000000) {
            System.out.println("Invalid Input");
        }
        else{
            int rev=0;
            while (num>0) {
                int digit=num%10;         
                rev=rev*10+digit; // Append digit to reversed number
                num/=10;  
            }
            System.out.println(rev);
        }
        
    }
}
