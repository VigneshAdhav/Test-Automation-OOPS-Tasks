package com.coding;

import java.util.HashMap;
import java.util.TreeMap;

public class HashMapConversions {
    public static void main(String[] args) {
        HashMap<Integer,String> map = new HashMap<>();
        map.put(1,"A");
        map.put(3,"C");
        map.put(2,"B");

        TreeMap<Integer,String> tmap = new TreeMap<>(map);
        tmap.forEach((key,value)-> System.out.println(key+" "+value));


    }
}
