package com.example.unit_5;

public class CustomStack<T> {

    private Object[] stack;
    private int size;
    private int capacity;

    public CustomStack(int capacity) {
        this.capacity = capacity;
        this.stack = new Object[capacity];
        this.size = 0;
    }

    public void push(T item) {
        if (size == capacity) {
            // Handle stack overflow (optional)
            throw new RuntimeException("Stack overflow");
        }
        stack[size++] = item;
    }

    public T pop() {
        if (isEmpty()) {
            // Handle stack underflow (optional)
            // This is for trying to remove or retrieve a value from an already empty stack.
            throw new RuntimeException("Stack underflow");
        }
        T item = (T) stack[--size];
        stack[size] = null; // Clear the reference
        return item;
    }

    public T peek() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return (T) stack[size - 1];
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public static void main(String[] args) {
        CustomStack<Integer> stack = new CustomStack<>(5);

        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println(stack.pop()); // 3
        System.out.println(stack.peek()); // 2
        System.out.println(stack.size()); // 2
    }
}
