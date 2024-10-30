package stack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 * A Simple Stack.
 * 
 * @param <E>
 * 
 */
public class Stack<E> implements Iterable<E> {
    private List<E> list = new ArrayList<>();
    /**
     * Pushes an element onto the top of the stack.
     * 
     * @param element
     */
    public void push(E element) {
        list.add(element);
    }

    /**
     * Removes the top element of the stack, and returns that element.
     * 
     * @precondition The stack is not empty.
     */
    public E pop() {
        E end = list.get(list.size() - 1);
        list.remove(list.size() - 1);
        return end;
    }

    /**
     * Returns the top element of the stack, without removing it.
     */
    public E peek() {
        return list.get(list.size() - 1);
    }

    /**
     * Returns an iterator to the internal data structure of the stack.
     */
    public Iterator<E> iterator() {
        return new StackIterator();
    }

    private class StackIterator implements Iterator<E> {
        private int currentIndex = list.size() - 1;
        @Override
        public boolean hasNext() {
            return currentIndex >= 0;
        }

        @Override
        public E next() {
            return list.get(currentIndex--);
        }
    }

    /**
     * Returns the size of the stack.
     */
    public int size() {
        return list.size();
    }

    /**
     * Returns the stack as an ArrayList
     */
    public ArrayList<E> toArrayList() {
        ArrayList<E> listCopy = new ArrayList<>(list);
        return listCopy;
    }

    public static Integer sumStack(Stack<? extends Integer> stack) {
        int sum = 0;
        for (int n : stack) {
            sum += n;
        }
        return sum;
    }

    public static void prettyPrint(Stack<?> stack) {
        System.out.print("[");
        if (stack.size() == 0) {
            System.out.println("]");
            return;
        }
        Iterator<?> iter = stack.iterator();

        for (int i = 0; i < stack.size() - 1; i++) {
            System.out.print(iter.next() + " ");
        }
        System.out.println(iter.next() + "]");
    }

    public static void main(String[] args) {
        Stack<String> stack = new Stack<String>();
        stack.push("hello");
        stack.push("how");
        stack.push("are");
        stack.push("you");
        stack.push("today");
        prettyPrint(stack);
    }
}

