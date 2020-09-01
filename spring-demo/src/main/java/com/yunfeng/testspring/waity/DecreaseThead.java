package com.yunfeng.testspring.waity;

public class DecreaseThead extends  Thread{
    private MyObject myObject;

    public DecreaseThead(MyObject myObject){
        this.myObject=myObject;
    }
    @Override
    public void run() {
        for (int i=0;i<100;i++){
            try {
                Thread.sleep((long)Math.random()*1000);
                myObject.delete();
            }catch (Exception e){
            }

        }
    }
}
