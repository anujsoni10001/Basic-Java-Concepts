class MultithreadingDemo extends Thread 
{ 
    public void run() 
    { 
        try
        { 
           
         System.out.println ("Thread is Created"); 
  
        } 
        catch (Exception e) 
        { 
            // Throwing an exception 
         System.out.println ("Exception is caught"); 
        } 
    } 
} 
  
// Main Class 
 class Multithread 
{ 
    public static void main(String[] args) 
    { 
        
        for (int i=0; i<8; i++) 
        { 
MultithreadingDemo object = new MultithreadingDemo(); 
            object.start(); 
        } 
    }
}