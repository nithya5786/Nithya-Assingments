package week3.day1.assignments;

/*Polymorphism
 * Class:Calculator
 * Methods used:add()with 2 arguments and 3 arguments,multiply()with 2 arguments as int and 2 arguments as int and double
 * subtract() with 2 arguments as int and double
 * divide() with 2 arguments as int and 2 arguments with int and double
 */
public class Calculator {

	public void add(int i, int j) {
		int k = i + j;
		System.out.println(k);
	}

	public void add(int i, int j, int k) {
		int l = i + j + k;
		System.out.println(l);

	}

	public void multiply(int i, int j) {
		int k = i * j;
		System.out.println(k);
	}

	public void multiply(int i, double j) {
		double k = i * j;
		System.out.println(k);
	}

	public void subtract(int i, int j) {
		if (i > j) {
			int k = i - j;
			System.out.println(k);
		} else {
			int k = i - j;
			System.out.println(k);
		}
	}

	public void divide(int i, int j) {
		int k = i / j;
		System.out.println(k);

	}

	public void divide(int i, double j) {
		double k = i / j;
		System.out.println(k);
	}

	public static void main(String[] args) {
    Calculator cal = new Calculator();
    cal.add(1, 2);
    cal.add(1, 2, 3);
    cal.subtract(12, 3);
    cal.subtract(19, 12);
    cal.multiply(1, 2);
    cal.multiply(2, 3343434);
    cal.divide(4,2);
    cal.divide(344564, 3445666);
	}

}
