package cn.hbeu.example.eg3;

public class Land {

	public static void main(String[] args) {
		Village.setWaterAmount(200);
		int leftWater = Village.waterAmount;
		System.out.println("ˮ������"+leftWater+"��ˮ");
		Village zhaoZhuang,maJiaHeZhi;
		
		zhaoZhuang = new Village("�w�f");
		maJiaHeZhi = new Village("�R�Һ���");
		
		zhaoZhuang.setPeopleNumber(80);
		maJiaHeZhi.setPeopleNumber(120);
		
		zhaoZhuang.drinkWater(50);
		
		leftWater = maJiaHeZhi.lookWaterAmount();
		String name = maJiaHeZhi.name;
		System.out.println(name+"�l�Fˮ������"+leftWater+"��ˮ");
		maJiaHeZhi.drinkWater(100);
		
		leftWater = zhaoZhuang.lookWaterAmount();
		name = zhaoZhuang.name;
		System.out.println(name+"�l�Fˮ������"+leftWater+"��ˮ");
		
		int peopleNumber = zhaoZhuang.getPeopleNumber();
		System.out.println("�w�f�˿�:"+peopleNumber);
		
		peopleNumber = maJiaHeZhi.getPeopleNumber();
		System.out.println("�R�Һ����˿�:"+peopleNumber);
	}

}
