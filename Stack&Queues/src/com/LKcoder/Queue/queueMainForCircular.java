package com.LKcoder.Queue;

public class queueMainForCircular {
    public static void main(String[] args) throws Exception {
        CircularQueue queue = new CircularQueue(5);
        queue.insert(3);
        queue.insert(6);
        queue.insert(5);
        queue.insert(17);
        queue.insert(1);

        queue.display();

        System.out.println(queue.remove() + " Deleted");
        queue.insert(133);
        queue.display();

        System.out.println(queue.remove() + " Deleted");
        queue.insert(99);
        queue.display();

    }
}
