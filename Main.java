import java.util.*;
public class Main {
	public static void main(String[] args) {
		PriorityQueue qp = new PriorityQueue();
		qp.offer("B");
		qp.offer("A");
		qp.offer("C");
		qp.offer("E");
		qp.offer("D");
		qp.offer("F");
		qp.offer("G");
		qp.offer("H");
		qp.offer("I");
		qp.offer("J");
		qp.offer("K");
		System.out.println(qp.poll());
		System.out.println(qp.poll());
		System.out.println(qp.poll());
		System.out.println(qp.poll());
		System.out.println(qp.poll());
		System.out.println(qp.poll());
		System.out.println(qp.poll());
		System.out.println(qp.poll());
		System.out.println(qp.poll());
	}
}