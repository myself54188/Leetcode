package Leetcode_0701_0800.Leetcode_705;

class MyHashSet {
    int[] arr = new int[(int) (Math.pow(10, 6) + 1)];

    public MyHashSet() {

    }

    public void add(int key) {
        arr[key]++;
    }

    public void remove(int key) {
        arr[key] = 0;
    }

    public boolean contains(int key) {
        return arr[key] != 0;
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */