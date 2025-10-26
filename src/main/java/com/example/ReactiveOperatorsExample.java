// package com.example;
// import reactor.core.publisher.Flux;

// public class ReactiveOperatorsExample {
//     public static void main(String[] args) {

//         // MAP
//         Flux.just(1, 2, 3, 4)
//             .map(i -> i * 2)
//             .subscribe(i -> System.out.println("Mapped: " + i));

//         // FILTER
//         Flux.range(1, 6)
//             .filter(i -> i % 2 == 0)
//             .subscribe(i -> System.out.println("Even: " + i));

//         // FLATMAP
//         Flux.just("apple", "banana")
//             .flatMap(f -> Flux.fromArray(f.split("")))
//             .subscribe(System.out::println);

//         // REDUCE
//         Flux.range(1, 5)
//             .reduce((a,b) -> a+b)
//             .subscribe(sum -> System.out.println("Sum: " + sum));

//         // MERGE
//         Flux.merge(Flux.just(1,2,3), Flux.just(4,5,6))
//             .subscribe(i -> System.out.println("Merged: " + i));

//         // ZIP
//         Flux.zip(Flux.just("A","B","C"), Flux.just(10,20,30), (n,a)-> n+" is "+a)
//             .subscribe(System.out::println);

//         // CONCAT
//         Flux.concat(Flux.just("X","Y"), Flux.just("Z"))
//             .subscribe(System.out::println);
//     }
// }


package com.example;

import reactor.core.publisher.Flux;

public class ReactiveOperatorsExample {

    public static void main(String[] args) {
        System.out.println("map() Operator Example:");

        Flux<Integer> numbers = Flux.just(1, 2, 3, 4);

        numbers
            .map(i -> i * 2) // Multiply each element by 2
            .subscribe(i -> System.out.println("Mapped value: " + i));
    }
}


// package com.example;

// import reactor.core.publisher.Flux;

// public class ReactiveOperatorsExample {

//     public static void main(String[] args) {
//         System.out.println("filter() Operator Example:");

//         // Emit numbers from 1 to 6
//         Flux<Integer> numbers = Flux.range(1, 6);

//         // Select only even numbers
//         numbers
//             .filter(i -> i % 2 == 0)
//             .subscribe(i -> System.out.println("Even number: " + i));
//     }
// }


// package com.example;

// import reactor.core.publisher.Flux;

// public class ReactiveOperatorsExample {

//     public static void main(String[] args) {
//         System.out.println(" flatMap() Operator Example:");

//         // Emit fruit names
//         Flux<String> fruits = Flux.just("apple", "banana");

//         // Split each fruit into characters and flatten the streams
//         fruits
//             .flatMap(fruit -> Flux.fromArray(fruit.split("")))
//             .subscribe(System.out::println);
//     }
// }


// package com.example;

// import reactor.core.publisher.Flux;

// public class ReactiveOperatorsExample {

//     public static void main(String[] args) {
//         System.out.println(" reduce() Operator Example:");

//         // Emit numbers from 1 to 5
//         Flux<Integer> numbers = Flux.range(1, 5);

//         // Aggregate all numbers into a single sum
//         numbers
//             .reduce((a, b) -> a + b)
//             .subscribe(sum -> System.out.println("Sum: " + sum));
//     }
// }


// package com.example;

// import reactor.core.publisher.Flux;

// public class ReactiveOperatorsExample {

//     public static void main(String[] args) {
//         System.out.println("merge() Operator Example:");

//         // Two separate streams
//         Flux<Integer> flux1 = Flux.just(1, 2, 3);
//         Flux<Integer> flux2 = Flux.just(4, 5, 6);

//         // Merge both streams concurrently
//         Flux.merge(flux1, flux2)
//             .subscribe(i -> System.out.println("Merged value: " + i));
//     }
// }


// package com.example;

// import reactor.core.publisher.Flux;

// public class ReactiveOperatorsExample {

//     public static void main(String[] args) {
//         System.out.println(" zip() Operator Example:");

//         // Two separate streams
//         Flux<String> names = Flux.just("A", "B", "C");
//         Flux<Integer> ages = Flux.just(10, 20, 30);

//         // Combine streams element-wise
//         Flux.zip(names, ages, (name, age) -> name + " is " + age)
//             .subscribe(System.out::println);
//     }
// }


// package com.example;

// import reactor.core.publisher.Flux;

// public class ReactiveOperatorsExample {

//     public static void main(String[] args) {
//         System.out.println(" concat() Operator Example:");

//         // Two separate streams
//         Flux<String> stream1 = Flux.just("X", "Y");
//         Flux<String> stream2 = Flux.just("Z");

//         // Concatenate streams sequentially
//         Flux.concat(stream1, stream2)
//             .subscribe(System.out::println);
//     }
// }

