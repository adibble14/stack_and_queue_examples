import java.util.*;
public class MaxValue {

	public static void main(String[] args) {
		Stack<Integer> s = new Stack<>();
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number of digits:");
		int n = input.nextInt();
		System.out.println("Enter the digits:");
		for(int i = 0; i< n;i++) {
			s.push(input.nextInt());
		}
		int max = max(s);
		System.out.println("The max value is "+ max);

	}
	
	public static int max(Stack<Integer> s) { 
		Stack<Integer> backup = new Stack<>(); //this is the backup stack to keep the elements in s
		int maxValue = s.pop();
		backup.push(maxValue);
		
		while(!s.isEmpty()) {
			int next = s.pop();
			backup.push(next);
			maxValue = Math.max(maxValue, next);
		}
		
		while(!backup.isEmpty()) { //this adds the elements back in to s
			s.push(backup.pop());
		}
		return maxValue;
	}

}
