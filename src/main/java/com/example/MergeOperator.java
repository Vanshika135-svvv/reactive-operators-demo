package com.example;

import reactor.core.publisher.Flux;

public class MergeOperator {

    public static void main(String[] args) {
        System.out.println(" merge() Operator Example:");

        // Two separate streams
        Flux<Integer> flux1 = Flux.just(1, 2, 3);
        Flux<Integer> flux2 = Flux.just(4, 5, 6);

        // Merge both streams concurrently
        Flux.merge(flux1, flux2)
            .subscribe(i -> System.out.println("Merged value: " + i));
    }
}

