public class Question61 extends Thread{
  public void run(){
    System.out.print("Thread is Running.");
    }
    
public static void main(String args[]){  
		Question61 thread=new Question61();  
    thread.start();
	}  
}
