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
        float pcount=0,ncount=0;
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            if(arr[i]<0){
                ncount++;
            }
            else{
                 pcount++;
            }
        }
        System.out.printf("Count of Positive Integer is %.2f\n",pcount);
        System.out.printf("Count of Negative Integer is %.2f",ncount);
    }
}
