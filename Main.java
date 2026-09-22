import java.util.*;
public class Main
{
	public static void main(String[] args) {
		PriorityQueue qp=new PriorityQueue();
		
		qp.offer("B");
		qp.offer("A");
		qp.offer("C");
		qp.offer("E");
		qp.offer("D");
		qp.offer("F");
		
		System.out.println(qp.poll());
		System.out.println(qp.poll());
		System.out.println(qp.poll());
		System.out.println(qp.poll());
		System.out.println(qp.poll());
		System.out.println(qp.poll());

		
	}
}