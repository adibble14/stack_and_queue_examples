import java.util.*;
public class QueueExample {

	public static void main(String[] args) {
		Queue<Integer> q = new LinkedList<>();
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number of digits:");
		int n = input.nextInt();
		System.out.println("Enter the digits:");
		for(int i = 0; i< n;i++) {
			q.add(input.nextInt());
		}
		System.out.println("The digits that are greater than 30 are:");
		int num = q.size();
		for(int i = 0;i<num;i++) {
			int element = q.remove();
			if(element >= 30) {
				System.out.print(element+" ");
				q.add(element);
			}
		}
		
		//System.out.println();
		
		/*while(!q.isEmpty()) { //reverses the contents of the queue if wanted
			System.out.println(q.remove());
		}*/

	}

}
