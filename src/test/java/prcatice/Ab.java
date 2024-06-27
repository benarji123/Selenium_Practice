package prcatice;

abstract class Ab {
String surName;
public Ab(String surname) 
{
	// TODO Auto-generated constructor stub
	this.surName=surname;
}
  abstract void fullName();
	

}
class Circle extends Ab{

	String name;
	public Circle(String surname)
	{
		// TODO Auto-generated constructor stub
		super(surname);
	}
	
	@Override
	void fullName() 
	{
		System.out.println(surName+"  "+name);
	}
	
	
	
	}

