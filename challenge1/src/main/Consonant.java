package main;

public class Consonant {

	String str;
	public void setConsonant(String string) {
		// TODO Auto-generated method stub
		this.str = string;
	}
	
	 static boolean isConsonant(char ch) 
	    { 
		 	 
	       
	        return !(ch == 'a' || ch == 'e' ||  
	                ch == 'i' || ch == 'o' ||  
	                ch == 'u'|| ch == 'A' || ch == 'E' ||  
	                ch == 'I' || ch == 'O' ||  
	                ch == 'U') && ch >= 65 && ch <= 122; 
	    } 
	   
	public int getConsonant() {
		// TODO Auto-generated method stub
		  int count = 0; 
	        for (int i = 0; i < str.length(); i++)  
	       
	            if (isConsonant(str.charAt(i))) 
	                ++count; 
	        return count;
	}
	
	

}
