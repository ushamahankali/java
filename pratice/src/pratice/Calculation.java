package pratice;

public class Calculation {

	public static void main(String args[]) {
		Calculation c = new Calculation(10);
		int result = c.add();
		System.out.println("result = " + result);
	}

	int a;

	public Calculation(int a) {
		this.a = a;
	}

	public int add() {
		a = a + 10;
		try {
			a = a + 10;
			try {
				a = a * 10;
				throw new Exception();
			} catch (Exception e) {
				a = a - 10;
			}
		} catch (Exception e) {
		
			a = a - 10;
		}
		return a;
	}
}
