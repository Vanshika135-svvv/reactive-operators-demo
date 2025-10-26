package com.example;

import reactor.core.publisher.Flux;

public class ConcatOperator {

    public static void main(String[] args) {
        System.out.println(" concat() Operator Example:");

        // Two separate streams
        Flux<String> stream1 = Flux.just("X", "Y");
        Flux<String> stream2 = Flux.just("Z");

        // Concatenate streams sequentially
        Flux.concat(stream1, stream2)
            .subscribe(System.out::println);
    }
}
