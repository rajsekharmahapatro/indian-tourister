package io.app.indiantourister.other;

import java.util.LinkedList;
import java.util.Queue;

public class Example {
    public static Queue<Queue<Integer>> splitQueue(Queue<Integer> inputQueue) {
        Queue<Integer> oddQueue = new LinkedList<>();
        Queue<Integer> evenQueue = new LinkedList<>();

        while (!inputQueue.isEmpty()) {
            int num = inputQueue.poll();
            if (num % 2 == 0) {
                evenQueue.add(num);
            } else {
                oddQueue.add(num);
            }
        }
        Queue<Queue<Integer>> result = new LinkedList<>();
        result.add(oddQueue);
        result.add(evenQueue);
        return result;
    }
    public static void main(String[] args) {
        Queue<Integer> inputQueue = new LinkedList<>();
        inputQueue.add(1);
        inputQueue.add(10);
        inputQueue.add(6);
        inputQueue.add(7);
        inputQueue.add(5);
        inputQueue.add(4);
        inputQueue.add(3);
        inputQueue.add(8);
        inputQueue.add(9);
        inputQueue.add(2);
        Queue<Queue<Integer>> result = splitQueue(inputQueue);
        Queue<Integer> oddQueue = result.poll();
        Queue<Integer> evenQueue = result.poll();
        System.out.println("Odd Queue: " + oddQueue);
        System.out.println("Even Queue: " + evenQueue);
    }
}
