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
        for(int i=1;i<=n;i++){
            char a='A';
            for(int k=i;k<n;k++) {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++) {
                System.out.print(a+" ");
                a++;
            }
            System.out.println();
        }
        for(int i=n-1;i>0;i--){
            char a='A';
            for(int k=n;k>i;k--){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(a+" ");
                a++;
            }
            System.out.println();
        }
    }
}
