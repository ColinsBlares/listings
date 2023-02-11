package ru.Glava5;

public class Stack {
    private Object[] theArrey;
    private int topOfStack;

    static final int DEFAULT_CAPACITY = 10;
    public Stack(){
        theArrey = new Object[DEFAULT_CAPACITY];
        topOfStack = -1;
    }

    boolean isEmpty(){
        return topOfStack == -1;
    }

    Object top(){
        if(isEmpty())
            return null;
        return theArrey [topOfStack];
    }

    void pop(){
        if(isEmpty())
            return;
        topOfStack--;
    }

    Object topAndPop(){
        if(isEmpty())
            return null;
        return theArrey[topOfStack--];
    }

    void push (Object x){
        if (topOfStack + 1 == theArrey.length)
            doubleArray();
        theArrey [++topOfStack] = x;
    }

    void  makeEmpty(){
        topOfStack = -1;
    }

    private void doubleArray(){
        Object[] newArray;

        newArray = new Object[theArrey.length * 2];
        for (int i = 0; i < theArrey.length; i++){
            System.arraycopy(theArrey, 0, newArray, 0 , theArrey.length);
        }
    }
}

