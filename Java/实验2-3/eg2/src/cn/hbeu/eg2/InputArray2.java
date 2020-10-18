package cn.hbeu.eg2;

import java.util.Arrays;

public class InputArray2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []a={1,2,3,4,500,600,700,800};
		int []b,c,d;
		System.out.println(Arrays.toString(a));
		b=Arrays.copyOf(a, a.length);
		System.out.println(Arrays.toString(b));
		c=Arrays.copyOf(a, 4);
		System.out.println(Arrays.toString(c));
	}

}
