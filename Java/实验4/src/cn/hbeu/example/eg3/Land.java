package cn.hbeu.example.eg3;

public class Land {

	public static void main(String[] args) {
		Village.setWaterAmount(200);
		int leftWater = Village.waterAmount;
		System.out.println("水井中有"+leftWater+"升水");
		Village zhaoZhuang,maJiaHeZhi;
		
		zhaoZhuang = new Village("趙莊");
		maJiaHeZhi = new Village("馬家河子");
		
		zhaoZhuang.setPeopleNumber(80);
		maJiaHeZhi.setPeopleNumber(120);
		
		zhaoZhuang.drinkWater(50);
		
		leftWater = maJiaHeZhi.lookWaterAmount();
		String name = maJiaHeZhi.name;
		System.out.println(name+"發現水井中有"+leftWater+"升水");
		maJiaHeZhi.drinkWater(100);
		
		leftWater = zhaoZhuang.lookWaterAmount();
		name = zhaoZhuang.name;
		System.out.println(name+"發現水井中有"+leftWater+"升水");
		
		int peopleNumber = zhaoZhuang.getPeopleNumber();
		System.out.println("趙莊人口:"+peopleNumber);
		
		peopleNumber = maJiaHeZhi.getPeopleNumber();
		System.out.println("馬家河子人口:"+peopleNumber);
	}

}
