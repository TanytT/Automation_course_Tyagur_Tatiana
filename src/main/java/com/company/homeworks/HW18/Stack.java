package com.company.homeworks.HW18;

public class Stack {

    private int size;
    private int[] arr;
    private int top;

    public Stack(int s) {
        this.size = s;
        this.arr = new int[s];
        this.top = -1;
    }

    public boolean addElem(int elem) {

        arr[++top] = elem;

        return true;
    }

    public int deleteElem() {
        return arr[top--];
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public boolean isFull() {
        return (top == size - 1);
    }

    public int read() {
        return arr[top];
    }
}
