import java.util.Stack;
public class Equals {

	public static void main(String[] args) {
		Stack<Integer> s = new Stack<>();
		Stack<Integer> s2 = new Stack<>();
		s.push(1);
		s.push(2);
		s.push(3);
		
		s2.push(1);
		s2.push(2);
		s2.push(3);

		boolean equal = equals(s,s2);
		if(equal)
			System.out.println("True");
		else
			System.out.println("False");
		System.out.println(s);
		System.out.println(s2);

	}
	public static boolean equals(Stack<Integer> s, Stack<Integer> s2){
		Stack<Integer> both = new Stack<>();
		boolean equals = true;
		if(s.size() != s2.size()) {
			equals = false;
		}
		while(!s.isEmpty()) {
			int num = s.pop();
			int num2 = s2.pop();
			both.push(num);
			both.push(num2);
			if(num != num2) {
				equals = false;
			}
		}
		
		while(!both.isEmpty()) {
			s2.push(both.pop());
			s.push(both.pop());
		}
		
		if(equals == true) {
			return true;
		}
		else {
			return false;
		}
	}

}
