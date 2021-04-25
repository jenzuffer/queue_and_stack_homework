package custom;

import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

public class Bag<Item> implements Iterable<Item> {
    private Node first;

    // first node in list
    private class Node {
        Item item;
        Node next;
    }

    public void add(Item item) {
        // same as push() in custom.Stack
        Node oldfirst = first;
        first = new Node();
        first.item = item;
        first.next = oldfirst;
    }

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

    public int size() {
        int counter = 0;
        Iterator iterator = iterator();
        while (iterator.hasNext()) {
            counter++;
            iterator.next();
        }
        return counter;
    }
}
