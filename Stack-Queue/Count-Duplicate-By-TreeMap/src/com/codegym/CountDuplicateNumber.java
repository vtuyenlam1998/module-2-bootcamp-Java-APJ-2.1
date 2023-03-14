package com.codegym;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeMap;

public class CountDuplicateNumber {
    public static void main(String[] args) {
        String paragraph= "It is present in java 8. The computeIfPresent(Key, BiFunction) method of HashMap class which allows you to compute value of mapping for a specified key if key is already associated with a value (or is mapped to null)";
        TreeMap<String,Integer> treeMap = new TreeMap<>();
        paragraph=paragraph.toUpperCase();
        String[] arr= paragraph.split(" ");
        System.out.println(Arrays.toString(arr));
        for (int i=0;i<arr.length;i++) {
            if (treeMap.containsKey(arr[i])) {
                int count=treeMap.get(arr[i]);
                treeMap.replace(arr[i],count+1);
            }
            else treeMap.put(arr[i],1);
        }
        System.out.println(treeMap);
    }
}
