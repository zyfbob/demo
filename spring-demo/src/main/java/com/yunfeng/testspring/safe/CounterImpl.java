package com.yunfeng.testspring.safe;

import sun.misc.Unsafe;

public class CounterImpl implements Counter{
    private Unsafe safes;
    private  volatile long count=0;
    private long offset;
    CounterImpl() throws NoSuchFieldException, IllegalAccessException {
        safes=safe.getUnsafe();
        offset = safes.objectFieldOffset(CounterImpl.class.getDeclaredField("count"));
        System.out.println("偏移量：{}"+offset);
    }
    @Override
    public void count() {
        long current=count;
        while(safes.compareAndSwapLong(this,offset,current,current+1)){
          //  current=count;
            break;
        }
    }

    @Override
    public long getCount() {
        return this.count;
    }
}
