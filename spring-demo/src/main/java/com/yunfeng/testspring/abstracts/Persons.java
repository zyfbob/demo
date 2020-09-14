package com.yunfeng.testspring.abstracts;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Persons {

    private  Persons next;

    abstract  void print();

    public void printable(){
           this.print();
           if(next!=null){
               next.print();
           }
    }

}
