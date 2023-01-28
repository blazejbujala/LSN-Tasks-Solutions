LSN tasks solutions

In this project you can find solutions to tasks received form LSN company.

Task 1
As an input takes a long list of integers, separated with space one from the other.
Code is sorting integers and gives basic information about numbers like :
number of elements
number of distinct elements
min value
max value

To use please call methods from Task1 in Main class / main methods as per below examples :

public static void main(String[] args) {

        Task1 numberList = new Task1();
        numberList.sortNumbers(numberList.readUserInput());

}

Task 2
As an input takes a long list of integers, separated with space one from the other.
Code finds all the pairs (in this integer list) that sum up to declared number. 
In each pair in the output first number is not greater than the second one.
Pairs are sorted in an ascending order.

To use please call methods from Task2 in Main class / main methods as per below examples :

public static void main(String[] args) {

        Task2 task2 = new Task2();
        task2.printPairs(task2.readUserInput(), 13);
}
