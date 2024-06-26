/**
 * Runner
 */
public class Runner {

    public static void main(String[] args) {
        Queue q = new Queue();
        q.enQueue(5);
        q.enQueue(10);
        q.enQueue(3);
        q.enQueue(3);
        q.enQueue(3);
        q.enQueue(3);
        q.display();
        q.deQueue();
        q.display();
    }
}