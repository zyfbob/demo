package com.yunfeng.testspring.list;

public class MyList<E> {

    private int size;

    private Node<E> first;

    private Node<E> NULL=(Node<E>)null;

    private static final String PLAIN_NULL="null";

    public MyList(){
        this.first=NULL;
    }
    class Node<E>{
        Node<E> next;
        private   E e;
        public Node(E e){
          this.e=e;
        }
    }

    /**
     *
     * @param e
     */
    public void add(E e){
      Node<E> newNode=new Node<>(e);
        newNode.next=first;
        this.size++;
        this.first=newNode;
    }

    /**
     * 级联插入
     * @param e
     * @return
     */
    public MyList<E> add1(E e){
        Node<E> newNode=new Node<>(e);
        newNode.next=first;
        this.size++;
        this.first=newNode;
        return this;
    }

    public int size() {
        return size;
    }

    public static void main(String[] args) {
        MyList myList=new MyList();
        myList.add("ccc");
        myList.add("dd");
        System.out.println(myList.size());
    }
}
