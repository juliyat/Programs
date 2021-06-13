package com.company.algs;

public class Queue {
    private static class Node{
        int data;
        Node(int data){
            this.data = data;
        }
        Node next;
    }
    private Node head;
    private Node tail;
public boolean isEmpty(){
    return head == null;
}
public int pop(int data){
        return head.data;
}
public void add(int data){
    Node node = new Node(data);
    if(tail != null){
        tail.next = node;
        tail = node;
    }
    if(head == null){
        head = node;
    }
}
public int remove(){
    int data = head.data;
  head = head.next;
    return data;


}
}

