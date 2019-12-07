package SberbankEducation.Practics;

import java.util.Iterator;

public class Task4_4 {
    public int [] arr;
    private int nextElement = 0;
    private int prevElement = -1;

    public Task4_4(int[] arr){
        this.arr = arr;
    }

    public int next() throws NullPointerException{
        if (this.hasNext()){
            this.prevElement = this.nextElement;
            this.nextElement+=1;
            return  this.arr[this.nextElement];
        }else{
            throw new NullPointerException();
        }
    }

    public boolean hasNext(){
        if (this.nextElement < this.arr.length){
            return true;
        }else{
            return false;
        }
    }

    public int prev() throws NullPointerException{
        if (prevElement > -1) {
            return this.arr[prevElement];
        }else{
            throw new NullPointerException();
        }
    }
}
