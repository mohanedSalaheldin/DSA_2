/**
 * Runner
 */
public class Runner {

    public static void main(String[] args) {
        System.out.println("Hello world");
        Stack stack = new Stack(6);
        
        stack.push(10);
        stack.push(19);
        stack.push(11);
        stack.showCapacity();
        stack.display();
        stack.pop();
        stack.showCapacity();
        stack.pop();
        stack.showCapacity();
        stack.pop();
        stack.showCapacity();
        stack.display();
        System.out.println("top is: "+ stack.peek());
        

        

    }
}