package dataStructures;

/**
 *
 */
public class LinkedList {

    private LlNode head;
    private LlNode tail;

    /**
     *
     * @param c
     */
    public void insert(char c) {
        if(head==null) {
            head = new LlNode(c);
            tail = head;
        }
        else {
            LlNode incoming = new LlNode(c);
            tail.next = incoming;
            tail = incoming;
        }
    }

    /**
     *
     * @return
     */
    public char peek() {
        return head.c;
    }

    /**
     * @return
     */
    public char poll() {
        char out = head.c;
        head = head.next;
        return out;
    }

    private class LlNode {
        char c;
        LlNode next;

        public LlNode(char c) {
            this.c = c;
        }
    }
}
