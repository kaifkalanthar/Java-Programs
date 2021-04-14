package com.GetStronger;

import java.util.LinkedList;
import java.util.Stack;

public class Queuery {
    LinkedList queues;

    Queuery(){
        queues=new LinkedList();
    }
    public boolean IsEmpty(){
        return queues.isEmpty();
    }
    public int size(){
        return queues.size();
    }
    public void Enqueue(String dequeue){
           queues.addLast(dequeue);
    }
    public String Deque(){
        return (String) queues.remove(0);
    }
    public String peek (){
        return (String) queues.peek();
    }
    public static void main(String[] args) {
	// write your code here
       /* Queuery q =new Queuery();
        q.Enqueue("Hi");
        q.Enqueue("Guys");
        q.Enqueue("This is for you");
        System.out.print(q.Deque()+" ");
        System.out.print(q.Deque()+" ");
        System.out.print(q.Deque()+" ");

        */
        Stack <String> Stacky =new Stack<>();
        Stacky.push("There!");
        Stacky.push("Hi");
        System.out.print(Stacky.pop()+" ");
        System.out.println(Stacky.peek());
        System.out.print(Stacky.pop()+". ");



    }
}
