# reactive-operators-demo
# Reactive Operators in Java

## Aim
Implement and understand key Reactive Streams Operators using **Project Reactor** in Java.

---

## Key Operators

| Operator       | Purpose                                                                 |
|----------------|-------------------------------------------------------------------------|
| `map()`        | Transforms each emitted value.                                          |
| `filter()`     | Emits values that meet a condition.                                     |
| `reduce()`     | Aggregates emitted values into a single result.                        |
| `flatMap()`    | Maps values to inner streams and flattens them.                         |
| `concatMap()`  | Runs inner streams sequentially.                                        |
| `merge()`      | Merges multiple streams concurrently.                                   |
| `concat()`     | Combines multiple streams in sequence.                                  |
| `zip()`        | Combines values from multiple streams by their emission index.         |

---

## Setup

### 1. Create project folder
```bash
mkdir reactive-operators-demo
cd reactive-operators-demo
```
### 2. Initialize Maven project

```bash
mvn archetype:generate -DgroupId=com.example -DartifactId=reactive-demo -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false
cd reactive-demo
```

### 3. Add Project Reactor dependency
Update your `pom.xml` to include the following inside the main `<project>` tags:

```xml
<dependencies>
    <dependency>
        <groupId>io.projectreactor</groupId>
        <artifactId>reactor-core</artifactId>
        <version>3.6.0</version>
    </dependency>
</dependencies>
```

### 4. Create files
Create separate .java files for each operator, e.g.:

MapOperator.java

FilterOperator.java

FlatMapOperator.java

ReduceOperator.java

MergeOperator.java

ConcatOperator.java

ZipOperator.java

### Folder Structure
reactive-demo/ ├─ src/ │ ├─ main/ │ │ ├─ java/ │ │ │ └─ com/example/ │ │ │ ├─ MapOperator.java │ │ │ ├─ FilterOperator.java │ │ │ ├─ FlatMapOperator.java │ │ │ └─ ... ├─ pom.xml

## Run

### Using Maven
```bash
mvn clean compile exec:java -Dexec.mainClass=com.example.MapOperator
```

## Run

### Using Java directly
```bash
cd target/classes
java com.example.MapOperator

## Notes
* Each operator demonstrates a single concept.
* You can also use one file `ReactiveOperatorsExample.java` and uncomment operators one at a time.