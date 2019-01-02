
public class SubClass extends Super{
	public static void main(String args[]){
		Super object = new SubClass();
			object.test();
		
	}
	@Override
	public void publicMethod(){
		System.out.println("HI");
	};
	public void test(){
		System.out.println("Hello World");
	}

}
