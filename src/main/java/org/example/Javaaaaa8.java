package org.example;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Javaaaaa8 {
    public static void main(String[] args)  {
        int[] arr1={5,2,8,3,1};
        int[] arr2={2,4,1,7,9,10};
        String[] str={"Apple","banana","bananaaaa","graphes"};
        String [] str1={};
        int i = Arrays.stream(str1).mapToInt(s -> s.length()).max().orElse(0);
        System.out.println(i);
        //second smallest Arrays.stream(arr).sorted().distinct().skip(1).limit(1).forEach(i-> System.out.println(i));
       // Arrays.stream(arr1).filter(n1->Arrays.stream(arr2).anyMatch(n2->n2==n1)).forEach(e-> System.out.println(e));
//        IntStream.range(0,arr1.length/2).forEach(i->{
//            int temp=arr1[i];
//            arr1[i]=arr1[arr1.length-i-1];
//            arr1[arr1.length-i-1]=temp;
//        });
//        System.out.println(Arrays.toString(arr1));
//        IntStream.range(0,arr1.length/2).forEach(i-> System.out.print(i +" "));
//        int start=0;
//        int end=arr1.length-1;
//        while(start<=end){
//            int temp=arr1[start];
//            arr1[start]=arr1[end];
//            arr1[end]=temp;
//
//            start++;
//            end--;
//        }
//        System.out.println(Arrays.toString(arr1));
        List<Integer> integers = List.of(1, 2, 3, 4, 5,2, 5);
        HashSet<Integer> s=new HashSet<>();
        Set<Integer> ans = integers.stream().filter(l -> !s.add(l)).collect(Collectors.toSet());
        System.out.println(ans);
        System.out.println(s);
    }
}
