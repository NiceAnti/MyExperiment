package example1;

public class BeijingPeople extends ChinaPeople {


	@Override
	public void averageHeight() {
		// TODO Auto-generated method stub
		height=172.5;
		System.out.println("北京人的平均身高："+height+"厘米");
	}

	@Override
	public void averageWeight() {
		// TODO Auto-generated method stub
		weight = 75;
		System.out.println("北京人的平均体重:"+weight+"kg");
	}
	
	public void beijingOpera(){
		System.out.println("花脸，青衣，花旦和老生");
	}




}
