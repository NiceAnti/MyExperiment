package cn.hbeu.eg3;

import java.util.Random;
import java.util.Scanner;


public class GuessNumber {

	public static void main(String[] args) {
		Scanner reader= new Scanner(System.in);
		Random random = new Random();
		System.out.println("给悄一个1至100之整数,请猜猜这个数");
		int  realNumber = random.nextInt(100)+1;
		System.out.println("realNumber = "+realNumber);
		int yourGuess=0;
		System.out.println("输入您的猜测:");
		yourGuess = reader.nextInt();
		while(yourGuess != realNumber){
			if(yourGuess > realNumber){
				System.out.println("猜大了，再输入你的猜测：");
				yourGuess = reader.nextInt();
			}else{
				System.out.println("猜小了，再输入你的猜测：");
				yourGuess = reader.nextInt();
			}
		}
		
		System.out.println("猜对了！");
	}

}
