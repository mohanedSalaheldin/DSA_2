/**
 * Queue
 * 1. isFull
 * 2. isEmpty
 * 3. enQueue
 * 4. deQueue
 * 5. display
 */

public class Queue {
    int rear;
    int front;
    int[] arr;

    Queue(int size){
        arr = new int[size];
        rear = -1;
        front = -1;
    }
    Queue(){
        arr = new int[5];
        rear = -1;
        front = -1;
    }


    public void enQueue(int val) {
        if (!isFull()) {
            if (isEmpty()) {
                rear = front = 0;
                arr[rear] = val;
            } else {
                arr[++rear] = val;
            }
        }else{
            System.out.println("Queue is full");
        }
    }

    public int deQueue() {
        int val = -1;
        if (!isEmpty()) {
            val = arr[front];
            arr[front++] = 0;
        } else {
            System.out.println("Queue is Empty");
        }
        return val;
    }


    public boolean isEmpty(){
       return front ==-1 || front> rear; 
    }

    public boolean isFull(){
        return rear +1 == arr.length; 
    }  

    public void display() {
        for (int i = front; i <= rear ; i++) {
            System.out.print("->" +arr[i]);
        }
        System.out.println();
    }

}
