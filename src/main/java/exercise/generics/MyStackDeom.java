package exercise.generics;

import java.util.ArrayList;
import java.util.List;

public class MyStackDeom {

    public static void main(String[] args) {
        MyStack<String> myStack = new MyStack<>();
        System.out.println(myStack.isEmpty());
        myStack.push("adf");
        myStack.push("adsv");
        myStack.push("xcv");
        System.out.println(myStack.isEmpty());
        System.out.println(myStack.size());
        myStack.printElements();
        System.out.println(myStack.peek());
        System.out.println(myStack.pop());
        MyStack<Integer> myStack1 = new MyStack<>();
        System.out.println(myStack1.isEmpty());
        myStack1.push(12);
        myStack1.push(123);
        myStack1.push(1234);
        System.out.println(myStack1.isEmpty());
        System.out.println(myStack1.size());
        myStack1.printElements();
        System.out.println(myStack1.peek());
        System.out.println(myStack1.pop());

    }
}

class MyStack<T>{
    int size = 0;
    List<T> list = new ArrayList<>();
    void push(T data){
        list.add(data);
        size++;
    }
    T pop(){
        return list.get(--size);
    }
    T peek(){
        return list.get(size-1);
    }
    boolean isEmpty(){
        if(size==0)
            return true;
        else
            return false;
    }

    void printElement(int id){
        System.out.println(list.get(id));
    }
    void printElements(){
        for(int i=0;i< list.size();i++){
            System.out.println(list.get(i));
        }
    }
    int size(){
        return size;
    }
}
