import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int temp=a;
        int sum=0;
        while(a>0){
            sum+=a%10;
            a=a/10;
        }
        
        if(temp%sum==0){
            System.out.println("Harshad Number");
        }
        else{
            System.out.println("Not Harshad Number");
        }
    }
}
