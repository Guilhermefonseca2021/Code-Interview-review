// node  [value, next]
// sll - [head == add, remove, find, addFirst]
package linked_list;


public class SinglyLinkedList {
    // since we have accesses head node all we need actually to do is keep going from neighbors [head and next] > [] > null
    public static void main() {
        // the node have two properties (value and index)
        // when we loop through a list from begin to end don't change the memory location(which save us a lot of time)
 

        // singly linked list
        // suppose i'm changin inserting a pointer so it goes down like below in our array:
        // [7] > [-3] v     [1] > null
        //             [8] ^   
        // right up we have the new order representation of our new array.  
        

        // traversal
        // [7] > [-3] > [1] 
        //  ^         value = s
        //  |         current = head
        // head       while current != null;
        //            if current.value == val: 
        //            break
        //            current = current.next
    }
}