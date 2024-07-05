public class Linked {
    public void removeItem(int data, List){
        Node current = head;
        if (head.data == data){
            removeStart();
        }else {
            while (current.next !=null){
                if (data == current.next.data){
                    current.next = current.next.next;
                    break;
                }
                    current = current.next;
            }
        }
    }
}
