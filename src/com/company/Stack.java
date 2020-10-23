package com.company;

public class Stack {
    private Cell myList;

    Stack() {
        myList = null;
    }

    private Stack(Cell list) {
        myList = list;
    }

    public boolean isempty() {
        return myList == null;
    }

    public Object top() {
        return myList.first;
    }

    public void pop() {
        myList = myList.rest;
    }

    public void push(Object obj) {
        myList = new Cell(obj, myList);
    }

    public static Stack empty() {
        return new Stack(null);
    }

    private static class Cell {
        Object first;
        Cell rest;

        Cell(Object h, Cell t) {
            first=h;
            rest=t;
        }
    }
}
