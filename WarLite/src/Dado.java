
public class Dado {
	int max;
	
	public int roll(int x) {
		
		return (int) Math.floor((Math.random() * this.max) + 1) + x;
		
	}
	
	
	public int getMax() {
		return max;
	}


	public void setMax(int max) {
		this.max = max;
	}


	public Dado(int max) {
		
		this.setMax(max);
		
	}
	
}
