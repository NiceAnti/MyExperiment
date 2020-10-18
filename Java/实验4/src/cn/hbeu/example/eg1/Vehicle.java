package cn.hbeu.example.eg1;

public class Vehicle {

	double spped;
	int power;
	
	void speedUp(int s){
		spped = s;
	}
	
	void speedDown(int d){
		spped -=d;
	}
	
	void setPower(int p){
		power = p;
		
	}
	
	int getPower(){
		return power;
	}
	
	double getSpeed(){
		return spped;
	}

}
