package io.app.indiantourister.other;

import java.util.concurrent.CompletableFuture;

public class Asynch {

    public static void main(String... args) throws InterruptedException {
        create(4).thenAccept(data->{
            System.out.println(data);
            System.out.println(Thread.currentThread());
        });
        System.out.println("is this asynch?"+ Thread.currentThread());
        Thread.sleep(100);
    }

    static int compute(int n) {
        try {
            //by introducing this small delay in this computation, java switches to non-blocking this operation executes ona different thread
            //this is the thread====Thread[#20,ForkJoinPool.commonPool-worker-1,5,main]
            Thread.sleep(100);
            return n * 2;
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    static CompletableFuture<Integer> create(int n){
        return CompletableFuture.supplyAsync(()->compute(n));
    }
}
