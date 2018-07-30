package com.example.yangjiaxin;

import java.util.Scanner;

public class P1092 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        while(s.hasNextInt()){
            int n = s.nextInt(), sum = 0;
            if(n == 0){
                break;
            }   
            for(int i = 1; i <= n; i ++){
                int a = s.nextInt();
                sum += a;
            }
            System.out.println(sum);
        }
    }
}
