/**
 * Runner
 */
public class Runner {

    public static void main(String[] args) {
        CircleQueue q = new CircleQueue();
        q.enQueue(5);
        q.enQueue(10);
        q.enQueue(3);
        q.enQueue(3);
        q.enQueue(9);
        q.enQueue(9);
        q.display();
        q.deQueue();
        q.display();
        q.enQueue(-1);
        q.deQueue();
        q.display();



    }
}