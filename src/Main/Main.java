package Main;

import MultiThreadingTest.MultiThreadingTest;

public class Main {
	public static void main(String[] args) {
		MultiThreadingTest t1 = new MultiThreadingTest (10, 1000);
		MultiThreadingTest t2 = new MultiThreadingTest (1001, 10000);
		MultiThreadingTest t3 = new MultiThreadingTest (10001, 100000);
		MultiThreadingTest t4 = new MultiThreadingTest (100001, 500000);
		MultiThreadingTest t5 = new MultiThreadingTest (500001, 1000000);
		MultiThreadingTest t6 = new MultiThreadingTest (1000001, 5000000);
		MultiThreadingTest t7 = new MultiThreadingTest (5000001, 100000000);
		MultiThreadingTest t8 = new MultiThreadingTest (100000001, 500000000);
		MultiThreadingTest t9 = new MultiThreadingTest (500000001, 1000000000);
		MultiThreadingTest t10 = new MultiThreadingTest (1000000001, 1005000000);
		MultiThreadingTest t11 = new MultiThreadingTest (1005000001, 2000000000);
		MultiThreadingTest t12 = new MultiThreadingTest (2000000001, 2005000000);
		MultiThreadingTest t13 = new MultiThreadingTest (2005000000, 2145000000);
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		t6.start();
		t7.start();
		t8.start();
		t9.start();
		t10.start();
		t11.start();
		t12.start();
		t13.start();	
		
		
	}

}
