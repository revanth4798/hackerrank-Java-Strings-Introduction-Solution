import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        int c=0;
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        int len=A.length()+B.length();
        System.out.println(len);
        System.out.println(A.compareTo(B)>0?"Yes":"No");
        
        System.out.print(Character.toUpperCase(A.charAt(0))+A.substring(1)+" ");
            System.out.print(Character.toUpperCase(B.charAt(0))+B.substring(1));
        
        
    }
}
