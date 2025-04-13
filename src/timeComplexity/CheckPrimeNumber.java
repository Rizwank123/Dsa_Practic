package timeComplexity;

public class CheckPrimeNumber {

	public static void main(String[] args) {
		boolean flag = isPrime(4);
		if(flag) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}

	private static boolean isPrime(int n) {
		if (n <= 1)
			return true;
		for (int i = 2; i*i <= n; i++) {
			if (n % i == 0)
				return false;
		}
		return true;
	}

}
