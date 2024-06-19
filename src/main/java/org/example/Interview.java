package org.example;

import java.util.ArrayList;
import java.util.List;

public class Interview {
    public static void main(String[] args) {
        Customer c1=new Customer(120,"vihan");
        Customer c2=new Customer(50,"seema");
        Customer c3=new Customer(501,"seema1");
        Customer c4=new Customer(500,"sejal");
        Customer c5=new Customer(21,"Sunny");
        Customer c6=new Customer(210,"Pranav");



        List<Customer> l=new ArrayList<>();
        l.add(c1);
        l.add(c2);
        l.add(c3);
        l.add(c4);
        l.add(c5);
        l.add(c6);

        l.stream().filter(c->c.id>100).forEach(p-> System.out.println(p));
        System.out.println("-----------------------------------------------------------");
       // l.stream().map(c->c.name.charAt(0)=='v').forEach(p-> System.out.println());
        l.stream().filter(c->c.name.charAt(0)=='s').forEach(p-> System.out.println(p));


    }
}
