package com.example.yangjiaxin;

import java.util.Scanner;
 
public class P2017{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        for(int i=0;i<n;i++){
            String aString=scanner.next();
            char[] s=aString.toCharArray();
            int number=0;
            for(int j=0;j<aString.length();j++){
                int b=s[j];
                if((b>47)&&(b<58)){
                    number++;
                }
            }
            System.out.println(number);
        }
    }
}
