package Leetcode_1601_1700.Leetcode_1656;

import java.util.ArrayList;
import java.util.List;

class OrderedStream {
    String[] arr;
    int prt = 1;

    public OrderedStream(int n) {
        arr = new String[n + 1];
    }

    public List<String> insert(int idKey, String value) {
        arr[idKey] = value;
        List<String> strs = new ArrayList<String>();
        for (int i = prt; i < arr.length; i++) {
            if (arr[i] == null) {
                prt = i;
                break;
            }
            strs.add(arr[i]);

        }
        return strs;
    }
}