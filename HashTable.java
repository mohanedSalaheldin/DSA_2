/**
 * HashTable
 * 1. hashing function
 * 2. put
 * 3. get
 */
public class HashTable {
    Entry[] arr; 
    int size;

    public HashTable(int size){
        this.size = size;
        arr = new Entry[this.size];  
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new Entry();
        }   
    }

    public HashTable(){
        this.size = 10;
        arr = new Entry[this.size];   
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new Entry(0, "head");
        } 
    }

    public int hashingFunction(int key) {
        return key%size;
    }


    public void put(int key, String value) {
        Entry newEntry = new Entry(key, value);
        int index = hashingFunction(key);
        Entry head = arr[index];
        newEntry.next = head.next;
        head.next = newEntry;
    }
    

    public String get(int key) {
        int index = hashingFunction(key);
        Entry target = arr[index];
        String value = "-1";
        while (target!=null) {
            if (target.getKey() == key) {
                value = target.getValue();
                break;
            }
            target = target.next;
        }
        return value;
    } 
}