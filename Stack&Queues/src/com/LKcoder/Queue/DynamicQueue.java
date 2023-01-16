package com.LKcoder.Queue;

public class DynamicQueue extends CircularQueue {
    public DynamicQueue(){
        super(); // it will call CircularQueue()
    }

    public DynamicQueue(int size){
        super(size); // it will call CircularQueue(int size)
    }

    @Override
    public boolean insert(int item) {

        // this takes care of ot being full
        if (this.isFull()){
            // double the array size
            int[] temp = new int[data.length * 2];

            // copy all the previous items in new data
            for (int i = 0; i <data.length ; i++) {
                temp[i] = data[(front + i) % data.length];
            }
            front =0;
            end = data.length;
            data = temp;
        }

        // at this point we know that array is not full
        // insert item

        return super.insert(item);
    }
}
