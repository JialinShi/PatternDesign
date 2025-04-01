package com.example.adapter.iterator;

public class EnumerationAdapter implements Iterator{
    Enumeration enumeration;

    public EnumerationAdapter(Enumeration enumeration){
        this.enumeration = enumeration;
    }

    @Override
    public boolean hasNext() {
        return enumeration.hasMoreElements();
    }

    @Override
    public int next() {
        return enumeration.nextElement();
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }
}
