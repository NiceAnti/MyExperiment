package cn.hbeu.eg2;

public class GreekAlphabet {
	public static void main(String[] args) {
		int startPostion =0,endPostion = 0;
		char cStart = '¦Á',cEnd='¦Ø';

		startPostion = (int)cStart;
		endPostion = (int)cEnd;
		
		System.out.println("Ï£À°×ÖÄ¸±í£º ");
		for(int i = startPostion; i <= endPostion; ++i)
		{
			
			System.out.print(" "+(char)i);
		}
		
		
	}
	
}
