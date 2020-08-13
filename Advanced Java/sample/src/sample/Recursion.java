package sample;

public class Recursion {
	
	
	public int rec(int x) {
		
		if(x==0) {
			
			return 1;
		}
		
		return x * rec(x-1);
	}

}
