/**
 * Stack
 * 1. push `
 * 2. pop`
 * 3. peek
 * 4. isEmpty
 * 5. display`
 */
public class Stack {
    int[] arr;
    int top;

    Stack(int size){
        arr = new int[size];
        top = -1;
    }

    Stack(){
        arr = new int[5];
        top = -1;
    }

    public void push(int val) {        
        if (top < arr.length) {
            arr[++top] = val;
        }else{
            System.out.println("Stack is full");
        }
    }


    public int peek() {
        if (!isEmpty()) {
            return arr[top];
        }else{
            System.out.println("Stack is Empty");
            return -1;
        }
        
    }


    public int pop() {
        int result = -1;
        if (!isEmpty()) {
            System.out.println("hiii top is: "+ top);
            result =  arr[top];
            arr[top--] = 0;
        }else{
            System.out.println("Stack is Empty");
        }
        return result;
        
    }

    public void showCapacity() {
        System.out.println("Capacity: "+(top+1));
    }


    public void display() {
        for (int i = arr.length-1; i >= 0; i--) {
            if (arr[i] != 0) {
              System.out.print("->" +arr[i]);  
            } 
        }
        System.out.println();
    }

    public boolean isEmpty(){
        return top < 0 ;
    }
}

