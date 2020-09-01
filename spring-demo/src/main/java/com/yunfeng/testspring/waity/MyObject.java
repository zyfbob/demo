package com.yunfeng.testspring.waity;

public class MyObject {

    private int counter=0;

    public synchronized void add(){
      while (counter!=0){
      try {
          wait();
      }catch (Exception e){

      }
   }
        counter++;
        System.out.println(counter);
        notifyAll();
    }
    public synchronized void delete() {
        while (counter == 0) {
            try {
                wait();
            } catch (Exception e) {

            }
        }
        counter--;
        System.out.println(counter);
        notifyAll();
    }
}
