package com.example.yangjiaxin;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class P2072_1{

    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
           while(sc.hasNext()){
               String str = sc.nextLine();

               if(str.equals("#")){
                   break;
               }        
               String strs[] = str.split(" +");
               Map<String, String> map = new HashMap<String, String>();
               for(int i=0;i<strs.length;i++){
                    map.put(strs[i], strs[i]);
               }
               System.out.println(map.size());
           }
        }

}

