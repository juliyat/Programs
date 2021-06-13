package com.company.algs;

public class Stack {
    private static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }
    private Node head;
    public boolean isEmpty(){
        return head == null;
    }
    public int pop(){
        return head.data;
    }
    public void add(int data){
        Node node = new Node(data);
        if (head != null) {
           node.next = head;
        }
        head = node;
    }
    public int remove(){
        int data = head.data;
       head = head.next;
        return data;
    }
}
