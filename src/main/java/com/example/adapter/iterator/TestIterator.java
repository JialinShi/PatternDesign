package com.example.adapter.iterator;

public class TestIterator {

    public static void main(String[] args) {
        Enumeration enumeration = new Enumeration();
        Iterator iterator = new EnumerationAdapter(enumeration);

        System.out.println(enumeration.nextElement());
        System.out.println(iterator.next());

        System.out.println(enumeration.hasMoreElements());
        System.out.println(iterator.hasNext());
    }

}
