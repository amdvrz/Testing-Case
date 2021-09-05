package com.javaprogram;

public class Runner {
	
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		String e = "Aye";
		try {
			System.out.println(e.charAt(0));
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
			throw new Exception("This is an error");
		}
		
		Class1 class1 = new Class1(4,"Varane","Manchester United");
		class1.setName("Aye");
		class1.setAddress("Jakarta");
		System.out.println(class1.getName());
		System.out.println(class1.getAddress());
		System.out.println(class1.getNumberId());
		
		Child child = new Child();
		System.out.println(child.getParentName());
		child.printMessage();
		child.printMessage2();
		
		Implementer implementer = new Implementer();
		implementer.test1();
		implementer.test2();
		
		MyModifiedClass myModifiedClass = new MyModifiedClass();
		myModifiedClass.shareNewMessage();
		myModifiedClass.shareMessage();

		// MyAbstractClass myAbstractClass = new MyAbstractClass();
		Utility.hardWait(3);
		System.out.println("This is Delayed");
		
	}

}
