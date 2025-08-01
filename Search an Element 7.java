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
        int flag=0;
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int key=sc.nextInt();
        for(int i=0;i<n;i++){
            if(arr[i]==key){
                flag=1;
                break;
            }
        }
        if(flag==1){
            System.out.println(key+" is presented in an array.");
        }
        else{
            System.out.println(key+" is not presented in an array.");
        }
    }
}
