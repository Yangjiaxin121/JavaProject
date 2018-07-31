package com.example.yangjiaxin;

import java.util.Scanner;
 
public class P2007{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        while(scanner.hasNextInt()){
        	int t;
            int m=scanner.nextInt();
            int n=scanner.nextInt();
            int o=0,j=0;
            if(m>n)
            {
                t=m;
                m=n;
                n=t;
            }

            for(int i=m;i<=n;i++){
                if(i%2==0)
                    o+=(i*i);
                else {
                    j+=(i*i*i);
                }
            }
            System.out.println(o+" "+j);
        }
        scanner.close();
    }
}
