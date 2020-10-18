interface Dogstate
{
	public void showState();
	}
class SoftyStyle implements Dogstate
{
	public void showState()
	{
		System.out.println("听主人的命令");
	}
	}
class MeetEnemyState implements Dogstate
{
	public  void  showState() {
		System.out.println("狂叫，并冲向去很咬敌人");
	}
	}
class MeetFriendState implements Dogstate
{
	public void showState()
	{
		System.out.println("晃动尾巴，表示欢迎"); 
	}
	}
class MeetAnotherDog implements Dogstate
{
	public void showState()
	{
		System.out.println("嬉戏");
	}
	}
class Dog
{
	Dogstate state;
	public void show()
	{
		state.showState();
	}
	public void setState(Dogstate s)
	{
		state =s;
	}
	}
public class CheckDogState {

	public static void main(String args[])
	{
		Dog yellowDog =new Dog();
		System.out.print("狗在主人面前：");
		yellowDog.setState(new SoftyStyle());
		yellowDog.show();
		System.out.print("狗遇到敌人：");
		yellowDog.setState(new MeetEnemyState());
		yellowDog.show();
		System.out.print("够遇到朋友：");
		yellowDog.setState(new MeetFriendState());
		yellowDog.show();
		System.out.print("狗遇到同伴：");
		yellowDog.setState(new  MeetAnotherDog());
		yellowDog.show();
		
		
	}
}
