package main;

public class Lunar {

	int a, b;
	public void setLunar(int i, int j) {
		// TODO Auto-generated method stub
		this.a = i;
		this.b = j;
	}
	public int getLunar() {
		// TODO Auto-generated method stub
		if (a > b) {
		return a;
		}
		else if (b > a) {
		return b;
			}
		else
			{return 0; }
	}
	public int get2Lunar() {
		// TODO Auto-generated method stub
		
		if (a/1000 > b/1000) {
		return a;
		}
		else if (a/1000 < b/1000) {
		return b;
			}
		
		if (((a % 1000)/100) > ((b% 1000)/100)) {
			return a;
			}
			else if (((a% 1000)/100) < ((b% 1000)/100)) {
			return b;
				}
		
		if (((a% 100)/10) > ((b% 100)/10)) {
			return a;
			}
			else if (((a% 100)/10) < ((b% 100)/10)) {
			return b;
				}
		
		if (a % 10 > b % 10) {
			return a;
			}
			else if (a % 10 < b % 10) {
			return b;
				}
			else
				{return 0; }
	}
}
