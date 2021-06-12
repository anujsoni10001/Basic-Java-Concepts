class MyThread extends Thread { 
    public void run() 
    { 
        System.out.println("Thread Created");
        System.out.println("run() method called"); 
    } 
} 
  
class Third { 
    public static void main(String[] args) 
    { 
        MyThread t = new MyThread(); 
        //t.run();
	t.start();	 
	t.start();
    } 
}







//Normal Method run not multithreaded.