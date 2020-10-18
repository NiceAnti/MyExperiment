package example1;

public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChinaPeople chinaPeople = new ChinaPeople();
		AmericanPeople americanPeople = new AmericanPeople();
		BeijingPeople beijingPeople = new BeijingPeople();
		chinaPeople.speakHello();
		americanPeople.speakHello();
		beijingPeople.speakHello();
		americanPeople.averageHeight();
		beijingPeople.averageHeight();
		chinaPeople.averageHeight();
		
		chinaPeople.averageWeight();
		beijingPeople.averageWeight();
		americanPeople.averageWeight();
		
		chinaPeople.chinaGongfu();
		americanPeople.americanBoxing();
		beijingPeople.beijingOpera();
		beijingPeople.chinaGongfu();
	}

}
