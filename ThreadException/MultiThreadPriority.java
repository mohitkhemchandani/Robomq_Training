package ThreadException;

public class MultiThreadPriority {
	public static void main(String[] args) {
		
		try {
			PrintNameThread pnt1 = new PrintNameThread("A");
			pnt1.thread.setPriority(10);
			PrintNameThread pnt2 = new PrintNameThread("B");
			pnt2.thread.setPriority(1);
			PrintNameThread pnt3 = new PrintNameThread("C");
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
