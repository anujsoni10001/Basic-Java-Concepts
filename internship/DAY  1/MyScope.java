class MyScope{
	int a=0;
	public static void main(String args[]){
		
		{
		
			int a=9;
			System.out.println("A : "+a);
		}

		{

			int a=8;
			System.out.println("A : "+a);			
		}
		
		System.out.println("A : "+a);
	}
}