package com.example.yangjiaxin;


import java.util.Scanner;
 
public class P2005{
	public static void main(String args[]){
		Scanner cin=new Scanner(System.in);
		String str;
		char a[]=new char [20];
		int arr[]={31,28,31,30,31,30,31,31,30,31,30,31};
		
		while(cin.hasNext()){
			str=cin.nextLine();
			a=str.toCharArray();
			int len=a.length;
			
			
			int i=0;
			int years=0;
			for(;i<len;i++){
				if(a[i]=='/')
					break;
				else
					years=years*10+a[i]-'0';
			}
			int month=0;
			for(i++;i<len;i++){
				if(a[i]=='/')
					break;
				else
					month=month*10+a[i]-'0';
			}
			
			int day=0;
			for(i++;i<len;i++){
				if(a[i]=='/')
					break;
				else
					day=day*10+a[i]-'0';
			}
			
			
			if(month>2&&(years%4==0&&years%100!=0||years%400==0))
				day++;
			month--;
			for(i=0;i<month;i++)
				day+=arr[i];
			
			System.out.println(day);
		}
		cin.close();
	}
}
