class MyLinkedList {

    private int size = 0;
    private Node head;
    private Node tail;

    public MyLinkedList() {
        this.head = new Node();
        this.tail = this.head;
    }

    public int get(int index) {
        Node temp = this.head;
        
        if(index >= size) {
            return -1;
        }

        if(index == 0) {
            return temp.val;
        } else {
            for(int i=0; i<index; i++) {
                temp = temp.next;
            }

            return temp.val;
        }
    }

    public void addAtHead(int val) {
        if(size == 0) {
            this.head.val = val;
            size++;
        } else if(size == 1) {
            Node newHead = new Node(val);
            newHead.next = this.head;
            this.tail = this.head;
            this.head = newHead;
            size++;
        } else {
            Node newHead = new Node(val);
            newHead.next = this.head;
            this.head = newHead;
            size++;
        }
    }

   public void addAtTail(int val) {
        if(size == 0) {
            this.head.val = val;
            size++;
            return;
        }

        Node newTail = new Node(val);

        this.tail.next = newTail;
        this.tail = newTail;
        size++;
    }

    public void addAtIndex(int index, int val) {
        Node temp = this.head;

        if(index == 0) {
            addAtHead(val);
        } else if(index == size) {
            addAtTail(val);
        } else if(index>size) {
            return;
        } else {
            for(int i=0; i<index-1; i++) {
                temp = temp.next;
            }

            Node newNode = new Node(val);
            newNode.next = temp.next;
            temp.next = newNode;
            size++;
        }
    }

    public void deleteAtIndex(int index) {
        Node temp = this.head;
        
        if(index >= size) {
            return;
        }

        if(index == 0) {
            this.head = this.head.next;
            this.size--;
            return;
        } else if(index == size-1) {
            for(int i=0; i<this.size-2; i++) {
                temp = temp.next;
            }

            temp.next = null;
            this.tail = temp;
            this.size--;
            return;
        } else {
            for(int i=0; i<index-1; i++) {
                temp = temp.next;
            }

            temp.next = temp.next.next;
            this.size--;
        }
    }
}
    
class Node {
    int val;
    Node next;

    public Node() {}

    public Node(int val) {
        this.val = val;
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */