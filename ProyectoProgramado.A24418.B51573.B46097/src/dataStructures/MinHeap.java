package dataStructures;

public class MinHeap {
    private final Node[] heap;
    private final int MIN = 1;
    private int size;

    public MinHeap(int maxCapacity) {
        this.heap = new Node[maxCapacity];
        this.size = 0;
    }

    public void add(Node n) {
        size++;
        heap[waft(size, n)] = n;
    }

    public Node poll() {
        Node min = heap[MIN];
        heap[MIN] = heap[size];
        size--;
        sink();
        return min;
    }

    private int waft(int slot, Node n) {
        while (slot>1 && n.compareTo(heap[slot/2])<0) {
            heap[slot] = heap[slot/2];
            slot = slot/2;
        }
        return slot;
    }

    private void sink() {
        int i = MIN;
        int son = i*2;
        boolean heapOrder = false;
        Node aux = heap[MIN];

        while(son<=size && !heapOrder) {
            if(son!=size && heap[son+1].compareTo(heap[son])<0) {
                son++;
            }
            if(heap[son].compareTo(aux)<0) {
                heap[i] = heap[son];
                i = son;
                son =  i*2;
            }
            else heapOrder = true;
        }
        heap[i] = aux;
    }
}
