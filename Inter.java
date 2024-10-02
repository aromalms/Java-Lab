import java.util.Scanner;
abstract class Animal
{
	protected int legs;
	protected Animal(int legs)
	{
		this.legs=legs;
	}
	public void walk()
	{
		if(legs>0)
		{
			System.out.println("Animal can walk");
		}
		else 
		{
			System.out.print("Animal can't walk");
	}
	}
	public abstract void eat();
}


class Spider extends Animal
{
	public Spider()
	{
	super(8);
	}
	public void spider()
	{
		System.out.println("This is spider");
	}
	public void eat()
	{
		System.out.println("Spider can eat insects"); 
	}
}

class Cat extends Animal implements Pet
{
	private String name;
	public Cat(String name)
	{
		super(4);
		this.name=name;
	}
	public void cat() 
	{
		System.out.println("Cat has name " +name);
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public void play()
	{
			System.out.println("Cat can play");
	}
	public void eat()
	{
			System.out.println("Cat can eat");
	}
}

class Fish extends Animal implements Pet
{
	String name;
	
	public Fish(String name) 
	{
		super(0);
		this.name=name;
	}
	public void fish()
	{
		System.out.println("Fish has name "+name);
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public void play() 
	{
	System.out.println("Fish can play");	
	}
	public void eat()
	{
		System.out.println("\nFish eats food");
	}
}

interface Pet
{
	String getname();
	void setName(String name);
	void play();
}

public class Inter {

	public static void main(String[] args) 
	{
		Spider sp=new Spider();
		Cat cat=new Cat("Tom");
		Fish fish=new Fish("Kitty");
		sp.spider();
		sp.walk();
		sp.eat();
		System.out.println();
		cat.cat();
		cat.walk();
		cat.play();
		cat.eat();
		System.out.println();
		Scanner sc=new Scanner(System.in);
		fish.fish();
		fish.walk();
		fish.eat();
		fish.play();
		
	}
}
