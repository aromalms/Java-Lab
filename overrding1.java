class Human
{
		void eat() 
		{
			System.out.println("Human is eating");
		}
}
class Boy extends Human
{
	
	void eat()
	{
		System.out.println("Boy is eating");
		super.eat();
	}
}
public class overrding1 {

	public static void main(String[] args) 
	{
		Boy boy1=new Boy();
		boy1.eat();
	}

}
