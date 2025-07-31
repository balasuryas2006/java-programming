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
        if(n>=1 && n<=9){
            for(int i=1;i<=n;i++){
                System.out.println(n+" x "+i+" = "+n*i);
            }
        }
        else{
            System.out.println("Invalid Input");
        }
    }
}
