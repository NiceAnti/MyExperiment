package cn.hbeu.example.eg2;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TV haierTV = new TV();
		haierTV.setChannel(5);
		System.out.println("haierTV的頻道是"+haierTV.getChannel());
		Family zhangSanFamily = new Family();
		zhangSanFamily.buyTV(haierTV);
		
		System.out.println("zhangSanFamily 開始看電視節目");
		zhangSanFamily.seeTV();
		int m=2;
		System.out.println("zhangSanFamily將電視更換到"+m+"頻道");
		zhangSanFamily.remoteControl(m);
		System.out.println("haierTV的頻道是"+haierTV.getChannel());
		System.out.println("zhangSanFamily 在看電視節目");
		zhangSanFamily.seeTV();
	}

}
