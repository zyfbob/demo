package com.yunfeng.testspring.safe;

public class CounterTask implements Runnable{
    private Counter counter;

    private int numbers;

   public CounterTask(Counter counter,int numbers){
            this.counter=counter;
           this.numbers=numbers;
    }
    @Override
    public void run() {
      for (int i=0;i<numbers;i++){
          try {
              counter.count();
          }catch (Exception e){

          }
      }
    }
}
