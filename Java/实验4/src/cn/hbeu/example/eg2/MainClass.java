package cn.hbeu.example.eg2;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TV haierTV = new TV();
		haierTV.setChannel(5);
		System.out.println("haierTV���l����"+haierTV.getChannel());
		Family zhangSanFamily = new Family();
		zhangSanFamily.buyTV(haierTV);
		
		System.out.println("zhangSanFamily �_ʼ���ҕ��Ŀ");
		zhangSanFamily.seeTV();
		int m=2;
		System.out.println("zhangSanFamily���ҕ���Q��"+m+"�l��");
		zhangSanFamily.remoteControl(m);
		System.out.println("haierTV���l����"+haierTV.getChannel());
		System.out.println("zhangSanFamily �ڿ��ҕ��Ŀ");
		zhangSanFamily.seeTV();
	}

}
