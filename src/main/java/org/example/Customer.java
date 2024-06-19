package org.example;

public class Customer {
    int id;
    String name;

    public Customer() {
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public Customer(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
