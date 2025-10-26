package com.example;

import reactor.core.publisher.Flux;

public class FlatMapOperator {

    public static void main(String[] args) {
        System.out.println("flatMap() Operator Example:");

        // Emit fruit names
        Flux<String> fruits = Flux.just("apple", "banana");

        // Split each fruit into characters and flatten the streams
        fruits
            .flatMap(fruit -> Flux.fromArray(fruit.split("")))
            .subscribe(System.out::println);
    }
}

