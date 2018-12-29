#Musings While Hopping Districts in Rajasthan For Assembly Elections
#Java 8 Lambdas

    Java 8 Lambda expressions is pretty synonymous to creating Java Anonymous Inner Classes. 
    But the similarity just ends there.
    A Lambda expression behaves as the implementation of the method in the interface
    Java compilers is doing a type inference with lambdas
    Java 8 onwards you can have methods implemented in the interfaces. Such interfaces are 
    called functional interfaces. The prerequisites for an interface to qualify as a functional interface is:

    It can have as many concrete methods
    It can have one and only one abstract method

    Functional Interfaces
    Method references
    Collections Improvements: Stream API (Map and Reduce)

Passing Behaviour in Java

In Java everything is a noun (class) or a thing rather than an action or a verb! 
An OOPs behaviour. Lambda changes that. It allows the behaviour to be passed as a 
verb or an action rather than an entity or a class. When you pass the behaviour 
as an argument you don’t need to have multiple cases as in a switch case or an 
if else block to handle the behaviour or implementation.

Before Java 8 the behaviour was passed through a thing or an entity or a class 
which contained the action. With Java 8 the lambdas allow you to pass the exact 
action through functions. Functions do not belong to any class but just values which 
represent a piece of code to be executed.

Q. Can we assign a block of code to a variable?

Ans. Lambdas just do that!

    It is actually invalid to specify the return keyword when you have a one-liner lambda expression without {}

Example 1

doubleNumberFunction = (int a) ->a*2 //Ok

doubleNumberFunction = (int a) -> return a*2 //Nok

Example 2

addFunction = (int a, int b) -> a+b;

Example 3

greetingFunction = () ->System.out.println (“Hello World”);

So, what’s the type of these variables doubleNumberFunction, addFunction and greetingFunction?

Example 4

safeDivideFunction = (int a, int b) -> {

if(b==0) return 0;

return a/b;

};

Example 5

stringLenCountFunc = (String s) -> s.length (); // you don’t need return and curly brackets for one liner lambdas

2+1=3

2+2=4

2+3=5

2+4=6

Why Lambdas?

    Enables functional programming where functions are passed as entities
    Readable and concise code
    Better APIs than Java 7 since you don’t need to pass a class or an object to a method 
    instead you can pass functions itself
    Collections improvement through parallel processing
    Java is still inherently an Object-Oriented Language

Java 8 Streams... (to be contd..)
https://winterbe.com/posts/2014/03/16/java-8-tutorial/
