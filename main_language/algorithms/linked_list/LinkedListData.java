import java.util.LinkedList;

public class LinkedListData {
    // depending on location inserting a item in a large array cause a lot of cost of memory
    public static void main(String[] args) {
        // linked list have advantage about this operation.
        // linked lists don't have index
        // each node contains address where the node next node is located.
        // each node have a clue where the next node is located.
        // they are not contigious

        // to delete node we have our previous node instead
        // that is the way linked list is infer in array, they are bad at searching we can randomly access an element of an array

        // we can traverse ou doubly array from head to tail or tail to head.
        LinkedList<String> linkedList = new LinkedList<String>();
        linkedList.push("A");
        linkedList.push("B");
        linkedList.push("C");
        linkedList.pop();
        linkedList.poll();

        linkedList.add(4, "E");
        linkedList.remove("E");
        // System.out.println(linkedList.indexOf("F"));
        System.out.println(linkedList.peekFirst());
        System.out.println(linkedList.peekLast());
        
        linkedList.addFirst("0");
        linkedList.addFirst("G");

        String first = linkedList.removeFirst();
        String last = linkedList.removeLast();

        // node stores in 2 parts (Data + address)
        System.out.println(linkedList);
    }
}
