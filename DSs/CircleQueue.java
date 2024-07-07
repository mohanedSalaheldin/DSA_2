package DSs;
/**
 * CircleQueue
 * 1. getCapacity
 * 2. enQueue
 * 2. deQueue
 */
public class CircleQueue {
    int rear;
    int front;
    int[] arr;
    int numOfElements;

    CircleQueue(int size){
        numOfElements = 0;
        arr = new int[size];
        rear = size-1;
        front = 0;
    }
    CircleQueue(){
        numOfElements = 0;
        arr = new int[5];
        rear = 5-1;
        front = 0;
    }


    public void enQueue(int val) {
        System.out.println("size: "+numOfElements);
        if (!isFull()) {
            rear = (rear +1) % arr.length;
            arr[rear] = val;
            numOfElements++;
            
        } else {
            System.out.println("Queue is full");
        }
    }

    public int deQueue() {
        int val = -1;
        if (!isEmpty()) {
            numOfElements--;
            val = arr[front];   
            arr[front] = 0;     
            front = (front +1)% arr.length;
        } else {
            System.out.println("Queue is Empty");
        }
        return val;
    }

    


    public boolean isEmpty() {
        return numOfElements == 0;
    }
    public boolean isFull() {
        return numOfElements == arr.length;
    }

    public void display() {
        for (int i = 0; i < arr.length; i++) {
            System.out.print("->" +arr[i]);
        }
        System.out.println();
    }
    
}
