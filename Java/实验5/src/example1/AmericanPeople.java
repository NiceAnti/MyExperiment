package example1;

public class AmericanPeople extends People {

	@Override
	public void speakHello() {
		// TODO Auto-generated method stub
		System.out.println("How do you do");
	}

	@Override
	public void averageHeight() {
		// TODO Auto-generated method stub
		height=176;
		System.out.println("American's average height:"+height+" cm");
	}

	@Override
	public void averageWeight() {
		weight=75;
		System.out.println("American's average weight:"+weight +"kg");
	}
	
	public void americanBoxing(){
		System.out.println("Ö±È­£¬¹´È­£¬×éºÏÈ­");
	}


}
