import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        // Create a stack and push/pop strings as directed on StdIn.
        Stack<Integer> s = new Stack<Integer>();
        for (int index = 0; index < 10; index++) {
            s.push(index);
        }
        Iterator<Integer> iterator = s.iterator();
        for (Iterator<Integer> it = iterator; it.hasNext(); ) {
            Integer i = it.next();
            System.out.println(i);
        }
        QueueImpl<Integer> s1 = new QueueImpl<Integer>();
        for (int index = 0; index < 10; index++) {
            s1.enqueue(index);
        }
        while (!s1.isEmpty()) {
            Integer dequeue = s1.dequeue();
            System.out.println(dequeue);
        }
    }
}
