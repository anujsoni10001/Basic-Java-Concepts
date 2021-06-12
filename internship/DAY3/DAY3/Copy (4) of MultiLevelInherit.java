class First{
	public void show1(){
		System.out.println("First : Show1");
	}
}
class Second extends First{
	public void show2(){
		System.out.println("Second : Show2");
	}
}
class Third extends Second{
	public void show3(){
		System.out.println("Third : Show3");
	}
}
class MultiLevelInherit{
	public static void main(String args[]){
		Third t=new Third();
		
		
		t.show1();		
		t.show2();		
		t.show3();		
	}
}