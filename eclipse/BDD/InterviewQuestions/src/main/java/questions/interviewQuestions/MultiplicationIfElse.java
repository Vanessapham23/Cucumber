package interviewQuestions;

public class MultiplicationIfElse {
	public static void main(String[] args) {
		// Print 1 to N
		// If the number is multiple of 3 print  instead of the number
		// if the number is multiple of 5 print "Buzz" instead of the number,
		// if the number is multiple of 3 and 5 Print "Fizz Buzz" instead of the number
	
	int N = 100;
	for (int i =1 ; i <=N; i++) {
		
		if (i%5==0 && i%3==0 ) {
			System.out.println("FIZZ");
			
			
		}else if(i%5==0) {
			System.out.println("Buzz");
			
		}else if (i%3==0){
			System.out.println("Fizz Buzz");
			
		}
		else {
			System.out.println(i);
			
		}
		
	}
	
	
	
	}
}
