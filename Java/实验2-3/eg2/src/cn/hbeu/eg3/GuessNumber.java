package cn.hbeu.eg3;

import java.util.Random;
import java.util.Scanner;


public class GuessNumber {

	public static void main(String[] args) {
		Scanner reader= new Scanner(System.in);
		Random random = new Random();
		System.out.println("����һ��1��100֮����,��²������");
		int  realNumber = random.nextInt(100)+1;
		System.out.println("realNumber = "+realNumber);
		int yourGuess=0;
		System.out.println("�������Ĳ²�:");
		yourGuess = reader.nextInt();
		while(yourGuess != realNumber){
			if(yourGuess > realNumber){
				System.out.println("�´��ˣ���������Ĳ²⣺");
				yourGuess = reader.nextInt();
			}else{
				System.out.println("��С�ˣ���������Ĳ²⣺");
				yourGuess = reader.nextInt();
			}
		}
		
		System.out.println("�¶��ˣ�");
	}

}
