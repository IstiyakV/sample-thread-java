package sah;

public class Test extends Thread {
	public void run(){
		for(int i=0;i<5;i++){
			System.out.println("i="+i);
			try{
			Thread.sleep(500);
			}catch(Exception e){
				
				
				
				
				
			}
		}
	}

	public static void main(String x[])	{
		Test t=new Test();
		t.start();
		for(int j=0;j<5;j++){
			System.out.println("j="+j);
			try{
				Thread.sleep(1000);
			}catch(Exception e){}
		}
		Test t2=new Test();
		t2.start();
		
	}
			
}
