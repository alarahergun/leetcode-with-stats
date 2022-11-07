class MyCircularQueue {

    private int[] arr;
    private int front = -1;
    private int rear = -1;

    public MyCircularQueue(int k) {
        arr = new int[k];
    }
    
    public boolean enQueue(int value) {
        if(isFull()) {
            return false;
        } else {
            if(front == -1) {
                front = 0;
            }
            rear = (rear + 1) % arr.length;
            arr[rear] = value;
            return true;
        }
        
    }
    
    public boolean deQueue() {
       if(isEmpty()) {
           return false;
       } else {
           if(front == rear) {
               front = -1;
               rear = -1;
           } else {
              front = (front + 1) % arr.length;
           }
       }
        return true;
    }
    
    public int Front() {
        return isEmpty() ? -1 : arr[front];
    }
    
    public int Rear() {
        return isEmpty() ? -1 : arr[rear];
    }
    
    public boolean isEmpty() {
        if(this.front == -1) {
            return true;
        }
        return false;
    }
    
    public boolean isFull() {
        if(this.front == 0 && this.rear == arr.length -1) {
            return true;
        }
        
        if(this.rear + 1 == this.front) {
            return true;
        }
        
        return false;
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */