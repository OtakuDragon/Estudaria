package Modulo1.ex01;

public class FrameworkTest {
	boolean v1 = false;
	boolean v2 = false;
	
	@Init(runOnInstantiation=true)
	public void m1(){
		this.v1 = true;
	}
	@Init(runOnInstantiation=true)
	public void m2(){
		this.v2 = true;
	}

	public static void main(String[] args) throws Exception {
		
		
		FrameworkTest obj =	ObjectCreator.create(FrameworkTest.class);
		
		System.out.println(obj.v1);
		System.out.println(obj.v2);
	}

}
