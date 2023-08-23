package TNS;
 class A {
	void show()
	{
		System.out.println("Super class");
	}
}
 public class B extends A
{
    @Override
	void show()
	{
		System.out.println("Sub class");
	}
	void dis()
	{
		System.out.println("Sub1 class");
	}
}
	class main
	{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B b1 = new B();
		b1.show();
		b1.dis();

	}

}
	



