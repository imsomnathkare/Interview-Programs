public class EvenOddNum {
	int count = 1;

	static int N;

	public void printOddNum() {

		synchronized (this) {
			while (count < N) {

				while (count % 2 == 0) {

					try {
						wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			
			System.out.print( count);
			count++;

			notify();
			
			}

		}

	}

	public void printEvenNum() {
		synchronized (this) {
			while (count < N) {
				while (count % 2 == 1) {
					try {
						wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
						// TODO: handle exception
					}
				}
				System.out.print(count);
				count++;
				notify();
			}

		}
	}

	public static void main(String[] args) {
		N = 10;

		final EvenOddNum eo = new EvenOddNum();

		Thread t1 = new Thread(new Runnable() {

			public void run() {
				eo.printEvenNum();

			}
		});

		Thread t2 = new Thread(new Runnable() {

			public void run() {
				eo.printOddNum();

			}
		});

		t1.start();
		t2.start();

	}
}
