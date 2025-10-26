package com.example;

import reactor.core.publisher.Flux;

public class FilterOperator {

    public static void main(String[] args) {
        System.out.println(" filter() Operator Example:");

        // Emit numbers from 1 to 6
        Flux<Integer> numbers = Flux.range(1, 6);

        // Select only even numbers
        numbers
            .filter(i -> i % 2 == 0)
            .subscribe(i -> System.out.println("Even number: " + i));
    }
}

