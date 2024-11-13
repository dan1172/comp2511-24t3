package extragenerics;

import java.util.*;

public class MeowStack<E extends Collection<E>> implements Iterable<E> {
    List<E> list = new ArrayList<>();
    public void add(E e) {
        list.add(e);
    }

    @Override
    public Iterator<E> iterator() {
        return new MeowStackIterator();
    }

    private class MeowStackIterator implements Iterator<E> {
        // for dfs across the nested structure
        private Iterator<E> outerIterators = list.iterator();
        // private Iterator<E> innerIterator = outerIterators
        private E nextElement = null;


        public MeowStackIterator() {
            if (!list.isEmpty()) {
                iteratorStack.push(list.iterator());
                findNext(); // Set up the first element
            }
        }

        private void findNext() {
            nextElement = null;
            while (!iteratorStack.isEmpty()) {
                Iterator<E> currentIterator = iteratorStack.peek();

                if (currentIterator.hasNext()) {
                    nextElement = currentIterator.next();

                    // If nextElement is a collection, go deeper by pushing its iterator onto the stack
                    if (nextElement instanceof Collection) {
                        iteratorStack.push(((Collection<E>) nextElement).iterator());
                    }
                    break;
                } else {
                    // Pop the exhausted iterator
                    iteratorStack.pop();
                }
            }
        }

        @Override
        public boolean hasNext() {
            return nextElement != null;
        }

        @Override
        public E next() {
            if (nextElement == null) {
                throw new NoSuchElementException();
            }

            E currentElement = nextElement;
            findNext(); // Move to the next element
            return currentElement;
        }
    }
    public static void main(String[] args) {
        UMM root = new UMM("root");
        UMM child1 = new UMM("c1");
        UMM child11 = new UMM("c11");
        UMM child12 = new UMM("c12");
        UMM child2 = new UMM("c2");
        UMM child21 = new UMM("c21");
        child1.add(child11);
        child1.add(child12);
        child2.add(child21);
        root.add(child1);
        root.add(child2);

        // root.printTree();
        
        MeowStack<UMM> meowStack = new MeowStack<>();
        for (UMM umm : meowStack) {
            System.out.println(umm);
        }
    }
}

class UMM extends ArrayList<UMM> {
    private String name;

    public UMM(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addChild(UMM child) {
        this.add(child);
    }

    public void printTree() {
        System.out.println(name);
        for (UMM child : this) {
            child.printTree();
        }
    }
}
