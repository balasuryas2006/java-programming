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
        int orig=num;
        int sum=0;
        if(num>100 && num<1000){
            while(num!=0){
                int temp=num%10;
                sum+=Math.pow(temp,3);
                num/=10;
            }
        }
        if(orig==sum){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}
