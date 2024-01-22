package Leetcode_0701_0800.Leetcode_706;

class MyHashMap {
    int[] arr = new int[(int) (Math.pow(10, 6) + 1)];

    public MyHashMap() {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = -1;
        }
    }

    public void put(int key, int value) {
        arr[key] = value;
    }

    public int get(int key) {
        return arr[key];
    }

    public void remove(int key) {
        arr[key] = -1;
    }
}