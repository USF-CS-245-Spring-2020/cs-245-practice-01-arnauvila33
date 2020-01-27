public class Practice01MathRecursive implements Practice01Math{

	public int fact (int n){
		if(n<=0)
			throw new ArithmeticException("Negative number");
		if(n==1)
			return n;
		return n*fact(n-1);

	}

	public int fib (int n){
		if(n<0)
			throw new ArithmeticException("Number is negative");
		if(n==0)
			return 0;
		if(n==1)
			return 1;
		else
			return fib(n-1)+fib(n-2);

	}

}

