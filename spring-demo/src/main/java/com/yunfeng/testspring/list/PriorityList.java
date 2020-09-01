package com.yunfeng.testspring.list;

public class PriorityList<E extends Comparable> {

    private Node<E> first;

    private int size;

    public  PriorityList(){
        this.first=null;
    }

    public  int size(){
        return this.size;
    }
    class Node<E>{
        Node<E> next;
        private   E e;
        public Node(E e){
            this.e=e;
        }
    }

    public void add(E e){

        Node<E> newNode=new Node<>(e);
        

    }
}
