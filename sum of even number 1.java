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
        int m=sc.nextInt();
        int sum=0;
        
        if(m>n && n>0 && n<30 && m>0 && m<30){
                for(int i=n;i<=m;i++){
                    if(i%2==0){
                        sum+=i;
                    }
                }
            System.out.println(sum);
            }
        
        else{
            System.out.println("Invalid Input");
        }
    }
}
