package com.example;

import reactor.core.publisher.Flux;

public class ReactiveOperatorsExample {

    public static void main(String[] args) {

        System.out.println("Reactive Operators Demo\n");

        // 1. MAP Operator
        System.out.println("1. map() Operator:");
        Flux.just(1, 2, 3, 4)
            .map(i -> i * 2)  // Multiply each element by 2
            .subscribe(i -> System.out.println("Mapped value: " + i));
        System.out.println();

        // 2. FILTER Operator
        System.out.println("2. filter() Operator:");
        Flux.range(1, 6)
            .filter(i -> i % 2 == 0)  // Keep only even numbers
            .subscribe(i -> System.out.println("Even number: " + i));
        System.out.println();

        // 3. FLATMAP Operator
        System.out.println("3. flatMap() Operator:");
        Flux.just("apple", "banana")
            .flatMap(fruit -> Flux.fromArray(fruit.split(""))) // Split strings into characters
            .subscribe(System.out::println);
        System.out.println();

        // 4. REDUCE Operator
        System.out.println("4. reduce() Operator:");
        Flux.range(1, 5)
            .reduce((a, b) -> a + b) // Sum all elements
            .subscribe(sum -> System.out.println("Sum: " + sum));
        System.out.println();

        // 5. MERGE Operator
        System.out.println("5. merge() Operator:");
        Flux<Integer> flux1 = Flux.just(1, 2, 3);
        Flux<Integer> flux2 = Flux.just(4, 5, 6);
        Flux.merge(flux1, flux2)
            .subscribe(i -> System.out.println("Merged value: " + i));
        System.out.println();

        // 6. ZIP Operator
        System.out.println("6. zip() Operator:");
        Flux<String> names = Flux.just("A", "B", "C");
        Flux<Integer> scores = Flux.just(10, 20, 30);
        Flux.zip(names, scores, (name, score) -> name + " scored " + score)
            .subscribe(System.out::println);
        System.out.println();

        // 7. CONCAT Operator
        System.out.println("7. concat() Operator:");
        Flux.concat(Flux.just("X", "Y"), Flux.just("Z"))
            .subscribe(System.out::println);
        System.out.println("\nEnd of Reactive Operators Demo");
    }
}



