package com.example.yangjiaxin;


import java.util.Scanner;
 
public class P2039{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int num=scanner.nextInt();
        double[] bian=new double[3];
        for(int i=0;i<num;i++){
            for(int j=0;j<3;j++){
                bian[j]=scanner.nextDouble();
            }
            if((bian[0]+bian[1]>bian[2])&&(bian[2]+bian[1]>bian[0])&&(bian[0]+bian[2]>bian[1])){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}
