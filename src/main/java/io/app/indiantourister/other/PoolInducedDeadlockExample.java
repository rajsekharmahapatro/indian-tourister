package io.app.indiantourister.other;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class PoolInducedDeadlockExample {
    public static void main(String[] args) {
        // Create a fixed thread pool with 2 threads
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        System.out.println("main started."+ Thread.currentThread().getName());
        // Submit the first task
        Future<?> submit = executorService.submit(() -> {
            System.out.println("Task 1 started."+ Thread.currentThread().getName());

            // Submit another task to the same thread pool
            executorService.submit(() -> {
                System.out.println("Task 2 started."+ Thread.currentThread().getName());
                System.out.println("Task 2 completed."+ Thread.currentThread().getName());
            });

            // Simulate Task 1 waiting for Task 2 (which may lead to deadlock)
            try {
                Thread.sleep(1000); // Simulate work
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }

            System.out.println("Task 1 completed."+ Thread.currentThread().getName());
        });

        // Shutdown the executor service
        executorService.shutdown();
    }
}
