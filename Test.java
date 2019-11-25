package SberbankEducation.Practics;
public class Test{
    private int[] sourceArray;

    public Test(int[] source){
        this.sourceArray = source;
    }

    private void elementChanger(int index1, int index2){
        int tmp = this.sourceArray[index1];
        this.sourceArray[index1] = this.sourceArray[index2];
        this.sourceArray[index2] = tmp;
    }

    public void bubbleSort(){
        for (int i=0;i < this.sourceArray.length;i++){
            for (int j=0; j < i; j++){
                if (this.sourceArray[j] > this.sourceArray[j+1]){
                    this.elementChanger(j, j+1);
                }
            }
        }
    }

    public void printCount(){
        System.out.println();
        System.out.print("Count: " + String.valueOf(this.sourceArray.length));
    }

    public void printArr(){
        System.out.println();
        System.out.print("Array: ");
        for (int i = 0; i < this.sourceArray.length;i++){
            System.out.print(String.valueOf(this.sourceArray[i]) + ' ');
        }
    }

    public void fillArray(int elem){
        for (int i = 0; i<this.sourceArray.length;i++){
            this.sourceArray[i] = elem;
        }
    }

    public int getMax(){
        int max = this.sourceArray[0];
        for (int i = 1; i < this.sourceArray.length;i++){
            if (max < this.sourceArray[i]){
                max = this.sourceArray[i];
            }
        }
        return max;
    }

    public int getMin(){
        int min = this.sourceArray[0];
        for (int i = 1; i < this.sourceArray.length;i++){
            if (min > this.sourceArray[i]){
                min = this.sourceArray[i];
            }
        }
        return min;
    }

    public void insertElementToTail(int value){
        this.insertElementByPosition(this.sourceArray.length, value);
    }

    public void setValueByPosition(int index, int value){
        if ((index > this.sourceArray.length) || (index < 0)){
            return;
        }
        this.sourceArray[index] = value;
    }

    public void deleteElementByPosition(int pos){
        if ((pos > this.sourceArray.length) || (pos < 0)){
            return;
        }
        int [] result = new int [this.sourceArray.length - 1];
        for (int i =0; i < pos; i++){
            result[i] = this.sourceArray[i];
        }

        for (int i =pos + 1; i < this.sourceArray.length; i++){
            result[i-1] = this.sourceArray[i];
        }
        this.sourceArray = result;
    }

    public void insertElementByPosition(int pos, int value){
        if ((pos > this.sourceArray.length) ||(pos < 0)){
            return;
        }
        int [] result = new int [this.sourceArray.length + 1];

        for (int i =0; i < pos; i++){
            result[i] = this.sourceArray[i];
        }
        result[pos] = value;
        for (int i =pos + 1; i < this.sourceArray.length+1; i++){
            result[i] = this.sourceArray[i-1];
        }
        this.sourceArray = result;
    }
}
