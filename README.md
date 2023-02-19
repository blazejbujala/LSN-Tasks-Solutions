LSN tasks solutions

In this project you can find solutions to tasks received form LSN company.

Task 1

As an input takes a long list of integers, separated with space one from the other.
Code is sorting integers and gives basic information about numbers like :
number of elements
number of distinct elements
min value
max value

To use please call methods from Task1 package in task1/Main class / main methods as per below examples :

public static void main(String[] args) {

        Task1 numberList = new Task1();
        numberList.sortNumbers(numberList.readUserInput());

}

Task 2

As an input takes a long list of integers, separated with space one from the other.
Code finds all the pairs (in this integer list) that sum up to declared, as a parameter in method, number.
In each pair in the output first number is not greater than the second one.
Pairs are sorted in ascending order.

To use please call methods from Task2 package in task2/Main class / main methods as per below examples :

public static void main(String[] args) {

        Task2 task2 = new Task2();
        task2.printPairs(task2.readUserInput(), 13);
}

Task 3

Application is first asking for a positive number n, then it is asking for n pair of positive integers,
where each pair identifies a connection between two vertices in a graph.
After user gives all pairs, code gives information how many separated graphs are in the input.

To use please call methods from Task3 package in task3/Main class / main methods as per below examples :

public static void main(String args[]) {

        Input input = new Input();
        Task3 task3 = new Task3();

        task3.connectedComponents(input.readUserInput());
}