class MyHashMap {
    static class Node {
        int key, value;
        Node next;
        Node(int k, int v) {
            key = k; value = v;
        }
    }

    private Node[] buckets = new Node[10];

    private int hash(int key) {
        return key % buckets.length;
    }

    void put(int key, int value) {
        int i = hash(key);
        Node head = buckets[i];

        while (head != null) {
            if (head.key == key) {
                head.value = value;
                return;
            }
            head = head.next;
        }

        Node newNode = new Node(key, value);
        newNode.next = buckets[i];
        buckets[i] = newNode;
    }

    int get(int key) {
        int i = hash(key);
        Node head = buckets[i];

        while (head != null) {
            if (head.key == key)
                return head.value;
            head = head.next;
        }
        return -1;
    }
}
