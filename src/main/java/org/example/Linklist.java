package org.example;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;
//This is a test how to merge and clojne from intejji.
//this change is from sub branch.
interface abc{
    void sum();
}
public class Linklist {
    public static void main(String[] args) {
        abc a=()->{
            System.out.println("hi");
        };
        a.sum();
//        List<String> l1 =new LinkedList<>();
//        l1.add("vihan");
//        l1.add("sagil");
//        Iterator<String> i = l1.iterator();
//        while(i.hasNext()){
//            System.out.println(i.next());
//        }
        Map<String,String> map=new HashMap<>();

        map.put("abc","123");
        map.put("def","456");

        //Set<Map.Entry<String, String>> collect = map.entrySet().stream().sorted((m1, m2) -> m1.getKey().compareTo(m2.getKey())).collect(Collectors.toSet());
       map.entrySet().stream().sorted((Map.Entry.comparingByKey())).forEach(m1-> System.out.println(m1.getKey() +" "+m1.getValue()));

    }
}
