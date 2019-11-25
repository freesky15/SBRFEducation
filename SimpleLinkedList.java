package SberbankEducation.Practics;

public class SimpleLinkedList {
    private static int countElements;
    private int elementNumber;
    private int value;
    private SimpleLinkedList nextElement;
    private SimpleLinkedList prevElement;

    public void setNextElement (SimpleLinkedList next){
        this.nextElement = next;
    }

    public int getValue(){
        return this.value;
    }

    public static int getCountElements(){
        return countElements;
    }

    public void setPrevElement (SimpleLinkedList prev){
        this.prevElement = prev;
    }

    public SimpleLinkedList getNextElement(){
        return this.nextElement;
    }

    public SimpleLinkedList getPrevElement(){
        return this.prevElement;
    }

    public SimpleLinkedList(){
        this.value = 0;
        this.prevElement = null;
        this.nextElement = null;
        countElements += 1;
        this.elementNumber = countElements;
    }

    public SimpleLinkedList(int value, SimpleLinkedList prev, SimpleLinkedList next){
        this.value = value;
        this.prevElement = prev;
        this.nextElement = next;
        countElements += 1;
        this.elementNumber = countElements;
    }

    public SimpleLinkedList addNode(int value, SimpleLinkedList tail){
        if (nextElement != null){
            return addNode(value, nextElement);
        }
        else{
            SimpleLinkedList newElement = new SimpleLinkedList(value, tail, null);
            tail.nextElement = newElement;
            return newElement;
        }
    }

    public SimpleLinkedList addNodeToHead(int value, SimpleLinkedList tail){
        if (tail.prevElement != null){
            addNodeToHead(value, tail.prevElement);
            tail.elementNumber += 1;
        }
        else {
            SimpleLinkedList newHeadElement = new SimpleLinkedList(value, null, tail);
            tail.prevElement = newHeadElement;
            newHeadElement.elementNumber = 1;
            tail.elementNumber +=1 ;
        }
        return tail;
    }

    public SimpleLinkedList editElement(int index, int value, SimpleLinkedList tail){

        if (index == countElements){
            tail.value = value;
            return tail;
        }

        if ((index <= 0) || (index > countElements)){
            return tail;
        }
        if (index != tail.elementNumber){
            editElement(index, value, tail.prevElement);
        }
        else{
            tail.value = value;
        }
        return tail;
    }

    public SimpleLinkedList removeElement(int index, SimpleLinkedList tail){
        if (index == countElements){
            countElements -=1;
            SimpleLinkedList t = tail.prevElement;
            t.nextElement = null;
            return t;
        }

        if (index == 1){
            if (tail.elementNumber != index){
                SimpleLinkedList res = removeElement(index, tail.prevElement);
                res.elementNumber -= 1;
                if (res.elementNumber == countElements){
                    return res;
                }
                else{
                    return res.nextElement;
                }
            }
            else {
                SimpleLinkedList s = tail.nextElement;
                tail.nextElement.prevElement = null;
                countElements -=1;
                return s;
                //elementNumber -= 1;
            }
        }

        if ((index <= 0) || (index > countElements)){
            return tail;
        }

        if (tail.elementNumber != index){
            removeElement(index, tail.prevElement);
            //tail.elementNumber -= 1;
        }
        else {
            tail.prevElement.nextElement = tail.nextElement;
            tail.nextElement.prevElement = tail.prevElement;
            countElements -=1;
            tail.nextElement.elementNumber -= 1;
        }
        return tail;
    }

    /*-
    public static SimpleLinkedList generateSimpleLinkedList(int ... values){
        SimpleLinkedList elem = null;
        for (int val: values){
            elem = new SimpleLinkedList(val, elem, null);
        }
        return elem;
    }
    -*/

    public void printSimpleLinkedList(SimpleLinkedList elem){
        if (prevElement != null){
            System.out.print(String.valueOf(value) + "("+ String.valueOf(elementNumber) +")"  + " > ");
            prevElement.printSimpleLinkedList(elem);
        }
        else {
            System.out.print(String.valueOf(value) + "("+ String.valueOf(elementNumber) +")");
        }
    }
}
