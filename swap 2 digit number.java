import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine().trim();

        if (a.length()<2){
            System.out.println("STDOUT");
        }
        else{
            char first=a.charAt(0);
            char second=a.charAt(1);
            String swapped= ""+second+first;
            System.out.println(swapped);
        }
    }
}
