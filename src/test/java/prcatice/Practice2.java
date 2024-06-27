package prcatice;



public class Practice2 {

	private String name;
    private	int age;
	public Practice2(String name,int age) {
		// TODO Auto-generated constructor stub
		this.name=name;
		this.age=age;
		   
	}
	
	public void getDetails() {
		
		System.out.println("Name :"+name);
		System.out.println("Age :"+age);
	}
}
class Child extends Practice2{

	public Child() {
		// TODO Auto-generated constructor stub
		super("narada",29);
	}
	
	public void msg() {
		super.getDetails();
	}
}