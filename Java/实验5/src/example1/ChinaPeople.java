package example1;

public class ChinaPeople extends People {

	@Override
	public void speakHello() {
		System.out.println("����");
	}

	@Override
	public void averageHeight() {
		height = 168.78;
		System.out.println("�й��˵�ƽ����ߣ�"+height+"����");
	}

	@Override
	public void averageWeight() {
		weight = 68;
		System.out.println("�й��˵�ƽ������:"+65+"ǧ��");
	}
	
	public void chinaGongfu(){
		System.out.println("�����ӣ�վ���ɣ�˯�繭");
	}


}
