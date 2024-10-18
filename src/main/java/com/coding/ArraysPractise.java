package com.coding;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;

public class ArraysPractise {
 private Integer[] arr;
    public void arrayMin(Integer[] arr){
       // this.arr = arr;
        //System.out.println(Arrays.stream(arr).max();
        Arrays.sort(arr);
        System.out.println(arr[0]);
        System.out.println(Arrays.toString(arr));
    }
    public static void stringPrograme(){
        String s = "Vigneshwaran adhav dhruv";
     char[] ca = s.toCharArray();
       LinkedHashMap<Character,Integer> hm = new LinkedHashMap<>();
       for(int i=0;i<ca.length;i++){
           if(ca[i] != ' '){
           if(hm.containsKey(ca[i])){
               hm.put(ca[i],hm.get(ca[i])+1);
           }else{
               hm.put(ca[i], 1);
           }}
       }
        hm.forEach((key,value)->System.out.println(key+" "+value));
    }
    public static void main(String[] args) {
        stringPrograme();

    }
}
