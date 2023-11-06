public class LinearProbingHashtable
{
    private Integer[] hashTable;
    private int size;

    public LinearProbingHashtable(int size) {
        this.size = size;
        this.hashTable = new Integer[size];
    }

    public void add(int key) {
        int index = hashFunction(key);
        while (hashTable[index] != null) {
            index = (index + 1) % size;
        }
        hashTable[index] = key;
    }
    private int hashFunction(int key) {
        return key % size;
    }

    public void printHashTable() {
        for (int i = 0; i < size; i++) {
            System.out.println(i + ": " + hashTable[i]);
        }
    }
}
