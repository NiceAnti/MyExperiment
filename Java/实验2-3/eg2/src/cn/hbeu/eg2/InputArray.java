package cn.hbeu.eg2;

public class InputArray {
	public static void main(String[] args) {
		int []a = {100,200,300};
		System.out.println("数组a的长度为："+a.length);
		System.out.println("数组a的引用为："+a);
		int b [][] = {{1},{1,1},{1,2,1},{1,3,3,1},{1,4,6,4,1}};
		System.out.println("数组的一维数组的个数为："+b.length);
		System.out.println(b[4][2]);
		b[4]=a;
		System.out.println(b[4][2]);
	}
}
