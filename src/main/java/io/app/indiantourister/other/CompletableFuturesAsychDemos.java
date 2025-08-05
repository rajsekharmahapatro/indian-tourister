package io.app.indiantourister.other;

import java.util.concurrent.CompletableFuture;

public class CompletableFuturesAsychDemos {

    public static void main(String...args){
        CompletableFuture<String> api1 = CompletableFuture.supplyAsync(() -> {
            // Simulate API call
            try { Thread.sleep(8000);
            } catch (InterruptedException e) {}
            System.out.println("API 1 Completed");
            return "API1 Result";
        });

        CompletableFuture<String> api2 = CompletableFuture.supplyAsync(() -> {
            // Simulate API call
            try { Thread.sleep(1000); } catch (InterruptedException e) {}
            System.out.println("API 2 Completed");
            return "API2 Result";
        });
        System.out.println("inside main method");
        CompletableFuture<String> combined = api1.thenCombine(api2, (result1, result2) -> {
            
            return result1 + " & " + result2;
        });
        System.out.println(combined.join()); // Both API calls are done in parallel

    }
}
