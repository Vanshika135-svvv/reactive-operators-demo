package com.example;

import reactor.core.publisher.Flux;

public class MapOperator {

   public static void main(String[] args) {
        System.out.println(" map() Operator Example:");

        Flux<Integer> numbers = Flux.just(1, 2, 3, 4);

        numbers
            .map(i -> i * 2) // Multiply each element by 2
            .subscribe(i -> System.out.println("Mapped value: " + i));
    }
}
