package cn.hbeu.eg2;

public class GreekAlphabet {
	public static void main(String[] args) {
		int startPostion =0,endPostion = 0;
		char cStart = '��',cEnd='��';

		startPostion = (int)cStart;
		endPostion = (int)cEnd;
		
		System.out.println("ϣ����ĸ�� ");
		for(int i = startPostion; i <= endPostion; ++i)
		{
			
			System.out.print(" "+(char)i);
		}
		
		
	}
	
}
