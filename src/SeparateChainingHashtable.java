import java.util.LinkedList;

public class SeparateChainingHashtable {

    private LinkedList<Integer>[] hashTable;

    public SeparateChainingHashtable(int size) {
        hashTable = new LinkedList[size];
        for (int i = 0; i < size; i++) {
            hashTable[i] = new LinkedList<>();
        }
    }

    public void add(int key) {
        int index = hashFunction(key);
        hashTable[index].add(key);
    }

    private int hashFunction(int key) {
        return key % hashTable.length;
    }

    // Utility method to print the state of the hash table
    public void printHashTable() {
        for (int i = 0; i < hashTable.length; i++) {
            System.out.print(i + ": ");
            for (int key : hashTable[i]) {
                System.out.print(key + " -> ");
            }
            System.out.println("null");
        }
    }
}
