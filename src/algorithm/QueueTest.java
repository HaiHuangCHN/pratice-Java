package algorithm;

import java.util.Deque;
import java.util.LinkedList;

import org.junit.Test;

public class QueueTest {

	@Test
	public void test1() {
		Deque<Integer> queue = new LinkedList<Integer>();
		queue.addFirst(1);
		queue.addLast(6);
		queue.addFirst(2);
		queue.addLast(5);
		queue.removeLast();
		queue.removeLast();
		queue.removeFirst();
		queue.removeLast();
	}
}
