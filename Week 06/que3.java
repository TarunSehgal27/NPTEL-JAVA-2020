interface A {
	public abstract void run();
}

class B implements A {
	public void run() {}
}
class MyThread extends B
{
  public void run(){
    System.out.print("NPTEL Java");
  }
}
