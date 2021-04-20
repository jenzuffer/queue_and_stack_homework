import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

public class QueueImpl<Item> implements Iterable<Item> {
    private Node first;
    private Node last;
    private int nth;

    public boolean isEmpty() {
        return first == null;
    }

    public int size() {
        return nth;
    }

    public void enqueue(Item item) {
        Node oldlast = last;
        last = new Node();
        last.item = item;
        last.next = null;
        if (isEmpty()) first = last;
        else oldlast.next = last;
        nth++;
    }

    public Item dequeue() {  // Remove item from the beginning of the list.
        Item item = first.item;
        first = first.next;
        if (isEmpty()) last = null;
        nth--;
        return item;
    }

    @Override
    public Iterator<Item> iterator() {
        return new ListIterator();
    }

    private class ListIterator implements Iterator<Item> {
        private Node current = first;

        public boolean hasNext() {
            return current != null;
        }

        public void remove() {
        }

        public Item next() {
            Item item = current.item;
            current = current.next;
            return item;
        }
    }

    @Override
    public void forEach(Consumer<? super Item> action) {

    }

    @Override
    public Spliterator<Item> spliterator() {
        return null;
    }

    private class Node {
        Item item;
        Node next;
    }


    public boolean IsEmpty() {
        return last == null;
    }
}


