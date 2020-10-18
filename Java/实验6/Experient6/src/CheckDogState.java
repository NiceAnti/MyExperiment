interface Dogstate
{
	public void showState();
	}
class SoftyStyle implements Dogstate
{
	public void showState()
	{
		System.out.println("�����˵�����");
	}
	}
class MeetEnemyState implements Dogstate
{
	public  void  showState() {
		System.out.println("��У�������ȥ��ҧ����");
	}
	}
class MeetFriendState implements Dogstate
{
	public void showState()
	{
		System.out.println("�ζ�β�ͣ���ʾ��ӭ"); 
	}
	}
class MeetAnotherDog implements Dogstate
{
	public void showState()
	{
		System.out.println("��Ϸ");
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
		System.out.print("����������ǰ��");
		yellowDog.setState(new SoftyStyle());
		yellowDog.show();
		System.out.print("���������ˣ�");
		yellowDog.setState(new MeetEnemyState());
		yellowDog.show();
		System.out.print("���������ѣ�");
		yellowDog.setState(new MeetFriendState());
		yellowDog.show();
		System.out.print("������ͬ�飺");
		yellowDog.setState(new  MeetAnotherDog());
		yellowDog.show();
		
		
	}
}
