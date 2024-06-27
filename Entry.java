/* Entry
 * 
 */
public class Entry {
    int key ;
    String value;
    Entry next;

    public Entry(int key, String value){
        this.key = key;
        this.value = value; 
        this.next = null;
    }

    public Entry(){
        this.next = null;
    }

    public int getKey() {
        return this.key;
    }
    public String getValue() {
        return this.value;
    }
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "("+this.key+","+this.value+")";
    }
}
