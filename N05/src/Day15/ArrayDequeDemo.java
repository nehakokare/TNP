package Day15;

import java.util.ArrayDeque;
import java.util.Collections;

public class ArrayDequeDemo {

	public static void main(String[] args) {
		ArrayDeque<Integer >aqueue = new  ArrayDeque<Integer>();
		aqueue.add(40);
		aqueue.add(60);
		aqueue.add(70);
		aqueue.add(80);
		System.out.println(aqueue);
		
		aqueue.addFirst(1);
		aqueue.addLast(100);
		System.out.println("size : "+aqueue.size());
		System.out.println("Is query empty:"+aqueue.isEmpty());
		System.out.println("Element to removed:"+aqueue.peek());
		System.out.println("Element to be removed:"+aqueue.peekFirst());
		System.out.println("Element is removed last is:"+aqueue.peekLast());
		System.out.println("First element is removed :"+aqueue.removeFirst());
		System.out.println("Last element is removed:"+aqueue.removeLast());
        System.out.println(aqueue);	
        
        while(!aqueue.isEmpty())
        {
        	System.out.println(aqueue.remove()+"removed");
        	
        }
        System.out.println(aqueue);

	}

}
