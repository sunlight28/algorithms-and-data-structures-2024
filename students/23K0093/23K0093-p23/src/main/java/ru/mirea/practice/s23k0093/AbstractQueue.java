package ru.mirea.practice.s23k0093;

public abstract class AbstractQueue<T> implements Queue<T> {

    protected int size;

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public int size() {
        return size;
    }
}
