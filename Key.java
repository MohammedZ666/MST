package mst;

class Key implements Comparable<Key> {

    int vertexIndex;
    double key;

    public Key(int index, double key) {
        vertexIndex = index;
        this.key = key;
    }

    public int compareTo(Key k) {
        if (key < k.key) {
            return -1;
        } else if (key > k.key) {
            return 1;
        } else {
            return 0;
        }
   }

    public boolean isGreaterThan(Key k){
        
        if(this.key<k.key) return false;
        return true;
    }
}
