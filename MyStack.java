package SberbankEducation.Practics;

import java.util.ArrayList;

public class MyStack {
    private ArrayList<Integer> queue = new ArrayList<Integer>();
    private int lastElement = -1;

    public void AddElement(int element){
        this.lastElement += 1;
        queue.add(lastElement, element);
    }

    public void removeElement(){
        if (queue.isEmpty()) {
            System.out.println("The Stack is empty!");
        }else {
            queue.remove(this.lastElement);
            this.lastElement -=1;
        }
    }
    public int getElement(int index){
        if (index < queue.size() && index > -1 && !(queue.isEmpty())){
            return queue.get(index);
        }else{
            return -1;
        }
    }
    public void printStack(){
        for(Integer i : queue){
            System.out.println(i);
        }
    }
}
