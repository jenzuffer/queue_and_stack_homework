import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

public class Stack<Item> implements Iterable<Item>{

    private Node top;
    private int index;

    private class Node
    {
        Item item;
        Node next;
    }

    public Stack(){}

    void push(Item item){

    }

    public Item pop(){
        return null;
    }

    public boolean IsEmpty(){
        return top == null;
    }

    public int size(){
        return 0;
    }

    public Iterator<Item> iterator() {
        return null;
    }

    public void forEach(Consumer<? super Item> action) {

    }

    public Spliterator<Item> spliterator() {
        return null;
    }
}
