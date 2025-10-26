package com.example;

import reactor.core.publisher.Flux;

public class ZipOperator {

    public static void main(String[] args) {
        System.out.println(" zip() Operator Example:");

        // Two separate streams
        Flux<String> names = Flux.just("A", "B", "C");
        Flux<Integer> ages = Flux.just(10, 20, 30);

        // Combine streams element-wise
        Flux.zip(names, ages, (name, age) -> name + " is " + age)
            .subscribe(System.out::println);
    }
}

