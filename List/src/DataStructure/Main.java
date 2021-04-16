package DataStructure;

import java.util.LinkedList;

public class Main {
    Node head;
    int count;

    Main(int data){
        head =new Node(data);
        count =1;
    }

    //add
    public void add(int newData){
        Node Temp =new Node(newData);
        Node current =head;
        while (current.getNext() != null){
            current.getNext();
        }
        current.setNext(Temp);
        count++;
    }
     // get

    public int  get(int index){
            if (index<=0)return -1;
            Node current = head;
            for (int i=0;i<index;i++){
                current.getNext();
            }
            return current.getData();
    }

    //size

    public int size(){
        return count;
    }

    //IsEmpty

    public boolean isEmpty(){
        return head == null;
    }

    //remove
    public  void remove(){
        Node current = head;
        while (current.getNext().getNext() != null){
            current.getNext();
        }
        current.setNext(null);
        count--;
    }


    public static void main(String[] args) {
        LinkedList <Integer> linkedList =new LinkedList<>();
        linkedList.add(2);
        linkedList.add(4);
        linkedList.add(4);
        linkedList.add(6);
        for (int s: linkedList) {
            System.out.println(s);
        }

    }
}
