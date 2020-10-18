package cn.hbeu.eg3;

import java.util.Scanner;

public class Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner =new Scanner(System.in);
        int a=scanner.nextInt();
        System.out.println(a+"是"+(a+"").length()+"位数");
        
        if(a>=1 && a<=99999){
        	String str1=a+"";
        	StringBuilder str2= new StringBuilder(str1);
        	str2.reverse();
        	int count=0;
        	
        	for(int i=0;i<str1.length();i++){
        		if(str1.charAt(i)!=str2.charAt(i)){
        			System.out.println(str1 + "不是回文数");
    				break;
    			} else {
    				count++;
    			}

        	}
        	if (count == str1.length()) {
    			System.out.println(str1 + "是回文数");
    		}
        }
	}

}
