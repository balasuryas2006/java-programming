import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count=0;
        int sum=0;
        if(n>99){
        while(n!=0){
            int temp=n%10;
            sum+=temp;
            n=n/10;
        }
         System.out.println("Sum of digit is "+sum);
        }
        else{
            System.out.println("Invalid Input");
        }
        }
        
    }

