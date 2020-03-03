
class Key implements Comparable<Key> {

    int vertexIndex;
    int key;

    public Key(int index, int key) {
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
}