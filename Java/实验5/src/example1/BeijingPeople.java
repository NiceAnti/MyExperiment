package example1;

public class BeijingPeople extends ChinaPeople {


	@Override
	public void averageHeight() {
		// TODO Auto-generated method stub
		height=172.5;
		System.out.println("�����˵�ƽ����ߣ�"+height+"����");
	}

	@Override
	public void averageWeight() {
		// TODO Auto-generated method stub
		weight = 75;
		System.out.println("�����˵�ƽ������:"+weight+"kg");
	}
	
	public void beijingOpera(){
		System.out.println("���������£�����������");
	}




}
