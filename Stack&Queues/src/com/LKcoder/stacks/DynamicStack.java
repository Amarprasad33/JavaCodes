package com.LKcoder.stacks;

public class DynamicStack extends customStack{

    public DynamicStack(){
        super(); // it will call CustomStack()
    }

    public DynamicStack(int size){
        super(size); // it will call customStack(int size)
    }

    @Override
    public boolean push(int item){
        // this takes care of ot being full
        if (this.isFull()){
            // double the array size
            int[] temp = new int[data.length * 2];

            // copy all the previous items in new data
            for (int i = 0; i <data.length ; i++) {
                temp[i] = data[i];
            }
            data = temp;
        }

        // at this point we know that array is not full
        // insert item

        return super.push(item);

    }

}
