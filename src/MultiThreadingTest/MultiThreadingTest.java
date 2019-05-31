package MultiThreadingTest;

import java.util.ArrayList;

public class MultiThreadingTest extends Thread {

	private long startNum;
	private long endNum;
	private ArrayList<Boolean> changeList = new ArrayList<>();
	
	public MultiThreadingTest(long startNum, long endNum) {
		setStartNum(startNum);
		setEndNum(endNum);
	}

	public long getStartNum() {
		return startNum;
	}

	public void setStartNum(long startNum) {
		this.startNum = startNum;
	}

	public long getEndNum() {
		return endNum;
	}

	public void setEndNum(long endNum) {
		this.endNum = endNum;
	}
	
	public void run() {
		System.out.println("Thread is running");
		try {
			for(long i = 10; i <= this.endNum; i++) {
				for(long j =2; j <= (long) Math.sqrt(i); j++) {
					if(i %j != 0) {
						changeList.add(true);
					} else {
						changeList.add(false);
					}
					
				}
				
				if(!(changeList.contains(false))){
					System.out.println(Long.toString(i) + " is a prime number");
					changeList.removeAll(changeList);
				} else {
					changeList.removeAll(changeList);
				}
				
			}
			Thread.sleep(50);
			
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}	
	}
}
