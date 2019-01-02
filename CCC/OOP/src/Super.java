
public class Super {

	public void publicMethod(){
		privateMethod();
	}
	
	private void privateMethod(){
		System.out.println("WORKS");
	}
	
}
