public class DoubleHashingHashtable
{
    private Integer[] hashTable;
    private int size;

    public DoubleHashingHashtable(int size) {
        this.size = size;
        hashTable = new Integer[size];
    }

    public void add(int key) {
        int hash1 = hashFunction1(key);
        int hash2 = hashFunction2(key);
        int index = hash1;

        while (hashTable[index] != null) {
            index = (index + hash2) % size;
        }
        hashTable[index] = key;
    }

    private int hashFunction1(int key) {
        return key % size;
    }

    private int hashFunction2(int key) {
        return 7 - (key % 7);
    }

    // Utility method to print the state of the hash table
    public void printHashTable() {
        for (int i = 0; i < size; i++) {
            System.out.println(i + ": " + hashTable[i]);
        }
    }
}
