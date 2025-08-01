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
        int arr[]=new int[n];
        int count=1;
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n-1;i++){
                if(arr[i]!=arr[i+1]){
                    count++;
                }
            
        }
        if(count==1){
        System.out.println("There are "+count+" distinct element in the array.");
        }
        else{
            System.out.println("There are "+count+" distinct elements in the array.");
        }
    }
}
