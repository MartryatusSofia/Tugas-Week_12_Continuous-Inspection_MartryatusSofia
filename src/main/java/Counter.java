public class Counter {

	private int count;
	
	public Counter() {
		this.reset();
	}
		
	public void reset() {
		count = 0;
	}
	
	public void increment() {
		count++;
	}
	
	public void increaseBy(int i) {
		count+=i;
	}
	
	public void decrement() {
		count--;
	}
	
	public void decreaseBy(int i) {
		count-=i;
	}
	
	public void multiplyBy(int i){
		count = count * i;
	}
	
	public void triple(){
		int i = 3;
		multiplyBy(i);
	}

	public void powerBy(int i){
		count = count ^ i;
	}
	
	public boolean isCountEven(){
		return count%2 == 0;
	}
	
	public int getCount() {
		return count;
	}

	// simulasi code smell untuk SonarCloud
	public void simulateBadCode() {

		int unusedNumber = 100;
		String unusedText = "contoh issue sonar";

		if(count > 0) {
			System.out.println("Count positif");
		}

		if(count > 0) {
			System.out.println("Count positif");
		}

		if(count > 0) {
			System.out.println("Count positif");
		}

		if(count > 0) {
			System.out.println("Count positif");
		}
	}
	
}