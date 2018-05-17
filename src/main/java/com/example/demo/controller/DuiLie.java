package com.example.demo.controller;

import java.util.LinkedList;

public class DuiLie {
    private LinkedList link;

    public DuiLie( ){
        link = new LinkedList();
    }
    public void myAdd(Object obj) {
        link.add(obj);
    }
    public Object myGet() {
        return link.removeLast();
    }

    public boolean isNull() {
        return link.isEmpty();
    }

    public static void main(String[] args) {
        DuiLie duiLie = new DuiLie();
        for (int i = 0;i<5;i++){
            duiLie.myAdd(i);
        }

        for (int i = 0;i<5;i++){
            System.out.println(duiLie.myGet());
        }
        System.out.println(4<<2);
        System.out.println(4<<2);
        System.out.println(4<<2);
        System.out.println(4<<2);
        System.out.println(4<<2);
        System.out.println(4<<2);
    }
}
