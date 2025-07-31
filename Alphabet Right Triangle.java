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
        for (int i=1; i<=n;i++){  
            char ch = (char) ('A'+i-1);
            for (int j=1;j<=i;j++) {
                System.out.print(ch + " ");  
                ch++;
            }
         System.out.println();
        }
    }
}
