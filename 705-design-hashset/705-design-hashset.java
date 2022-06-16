class MyHashSet {
   HashNode head;
    public MyHashSet() {
        this.head = null;
    }
    
    public void add(int key) {
        HashNode newNode = new HashNode(key);
        if(this.head==null){
            this.head = newNode;
        }
        else{
            if(!this.contains(key)){
                HashNode currentNode = this.head;
                while(currentNode.next!=null){
                    currentNode = currentNode.next;
                }
                currentNode.next = newNode;
            }
        }
    }
    
    public void remove(int key) {
        if(this.head!=null){
            if(this.head.key==key) this.head = this.head.next;
            else{
                HashNode actual = this.head;
                HashNode scout;
                while(actual!=null && actual.next!=null){
                    scout = actual.next;
                    if(scout.key==key){
                        actual.next = scout.next;
                    }
                    actual = actual.next;
                }
            }
        }
    }
    
    public boolean contains(int key) {
        HashNode currentNode = this.head;
        while(currentNode!=null){
            if(currentNode.key==key) return true;
            currentNode = currentNode.next;
        }
        return false;
    }
}

class HashNode{
    int key;
    HashNode next;
    public HashNode(int key){
        this.key = key;
    }
}
/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */