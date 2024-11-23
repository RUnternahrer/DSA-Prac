/** 
 * Linked List Node Class
 * Author: Ryan Unternahrer
 * Created: 23/11/2024
 * Modified 23/11/2024
 */

package LinkedList;

public class Node {
    int value; // A numerical value stored in the node.
    Node next; // A pointer to the next node.

    /**
     * A new instance of the node class for the linked list.
     * 
     * @param data The data to be stored in the node.
     */
    public Node(int data) {
        this.value = data;
        this.next = null;
    }
}