public class Practice01MathIterative implements Practice01Math{

	public int fact(int n){
		if(n<=0){
		throw new ArithmeticException("Number is negative or zero");
		}
		
		int c=1;
		for(int i=n;i>0;i--){
			c=c*i;	
		}
		return c;




	}
	

	public int fib(int n){
		int first=1;
		int second=1;
		if(n<0)
			throw new ArithmeticException("negative");
		
		if(n==0){
			return 0;
		}
		if(n==1)
			return first;
		if(n==2)
			return second;
		for(int i=2;i<=n;i++){
			int temp=second;
			second=first+second;
			first=temp;
		}
		return first;

	}


}
