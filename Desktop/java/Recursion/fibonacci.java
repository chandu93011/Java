package Recursion;


/*
* Points to identify and to solve the recursion problem
* (i)   Break it down into the smaller problem.
* (ii)  The base condition is represented by answers we already have.
* (iii) write the reccurence relation if needed.
* (iV) Draw the recursive tree
* (V) See the flow of functions how they are getting into the stack.
* (vi) identify the flow of left tree calls and right tree calls.
* (vii) Draw tree and pointers again and again using pen and paper.
*  use a debugger to see the flow.
*
* Last step see how the values are returned step by step.
*
*
* vvvvvi
* arguments
* return type
* and body of the functions.
*
* */
public class fibonacci {
    public static void main(String[] args) {

        System.out.println(fib(8));
    }
    static int fib(int n){
        if(n<2){
            return n;
        }
        return fib(n-1) + fib(n-2);
    }

}

