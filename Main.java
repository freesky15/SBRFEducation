package SberbankEducation.Practics;

public class Main {
    public static void main(String[] args) {
        System.out.println("******************ArrayUtils************************");
        int [] values = {1,2,3,4,5,6,7,8,9};
        Test utils = new Test(values);
        utils.insertElementByPosition(5, 78);
        utils.printArr();
        utils.printCount();
        utils.insertElementToTail(666);
        utils.printCount();
        utils.printArr();
        utils.deleteElementByPosition(0);
        utils.printCount();
        utils.printArr();
        utils.setValueByPosition(3,999);
        utils.printArr();
        System.out.println();
        System.out.println("Max: " + String.valueOf(utils.getMax()));
        System.out.println("Min: " + String.valueOf(utils.getMin()));
        utils.fillArray(888);
        utils.printArr();
        System.out.println();

        utils.bubbleSort();
        utils.printArr();
        System.out.println("Max: " + String.valueOf(utils.getMax()));
        System.out.println("Min: " + String.valueOf(utils.getMin()));

        utils.bubbleSort();
        utils.printArr();

        System.out.println("\n******************LinkedList************************");

        SimpleLinkedList sLL = new SimpleLinkedList();
        sLL = sLL.addNode(11, sLL);
        sLL = sLL.addNode(22, sLL);
        sLL = sLL.addNode(33, sLL);
        sLL = sLL.addNode(44, sLL);
        System.out.println();
        sLL.printSimpleLinkedList(sLL);
        System.out.println("\nCount: " + String.valueOf(SimpleLinkedList.getCountElements()));

        sLL = sLL.addNodeToHead(55, sLL);
        System.out.println();
        sLL.printSimpleLinkedList(sLL);
        System.out.println("\nCount: " + String.valueOf(SimpleLinkedList.getCountElements()));

        sLL = sLL.removeElement(5, sLL);
        sLL.printSimpleLinkedList(sLL);
        System.out.println("\nCount: " + String.valueOf(SimpleLinkedList.getCountElements()));
        //System.out.println("\n" + String.valueOf(sLL.getValue()));
        sLL = sLL.removeElement(5, sLL);
        sLL.printSimpleLinkedList(sLL);
        System.out.println("\nCount: " + String.valueOf(SimpleLinkedList.getCountElements()));

        sLL = sLL.removeElement(1, sLL);
        sLL.printSimpleLinkedList(sLL);
        System.out.println("\nCount: " + String.valueOf(SimpleLinkedList.getCountElements()));

        sLL = sLL.editElement(2, 222, sLL);
        sLL.printSimpleLinkedList(sLL);
        System.out.println("\nCount: " + String.valueOf(SimpleLinkedList.getCountElements()));
    }
}
