package com.example;

import reactor.core.publisher.Flux;

public class ReduceOperator {

    public static void main(String[] args) {
        System.out.println(" reduce() Operator Example:");

        // Emit numbers from 1 to 5
        Flux<Integer> numbers = Flux.range(1, 5);

        // Aggregate all numbers into a single sum
        numbers
            .reduce((a, b) -> a + b)
            .subscribe(sum -> System.out.println("Sum: " + sum));
    }
}
