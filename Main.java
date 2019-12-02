package SberbankEducation.Practics;

import sun.reflect.generics.tree.Tree;

import javax.transaction.TransactionRequiredException;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Task4_3 c = new Task4_3();

        ArrayList<Double> u = new ArrayList<>();
        for (int i = 0; i < 10; i++){
            u.add(1.0);
        }

        Collection<Double> ar = c.removeDuplicates(u);
        for (Double b : ar){
            System.out.println(b.toString());
        }

        //String s = "The String class represents character strings. All string literals in Java programs, such as \"abc\", are implemented as instances of this class. Strings are constant; their values cannot be changed after they are created. String buffers support mutable strings. ... replaceAll(String regex, String replacement). Replaces each substring of this string that matches the given regular expression with the given replacement. String. replaceFirst(String regex, String replacement)";
        String s = "qqqeeerrrttty121212121fffffffffffffffffff";

        Task4_2 d = new Task4_2();
        TreeMap<Character, Integer> dict = d.getDictinary(s);
        for (Character key : dict.keySet()){
            System.out.println("Key: " + String.valueOf(key) + " Value: " + String.valueOf(dict.get(key)));
        }

        Task4_6 w = new Task4_6();

        System.out.println(w.getWinner(new String[]{"Ivan 5",
                "Petr 3", "Alex 10", "Petr 8", "Ivan 6", "Alex 5", "Ivan 100", "Petr 5", "Alex 1"}, 25));

        /*
        TreeMap<Usr, Double> users = new TreeMap<>();
        for (int i = 0; i < 10; i++){
            users.put(new Usr("Name" + String.valueOf(i), (int)(Math.random()*100)), (Math.random()*1000));
        }

        for(Usr u: users.keySet()){
            System.out.println(String.valueOf(u.age) + " : " + u.name + " - Value: " + String.valueOf(users.get(u)));
        }

        TreeMap<Usr, Double> t = new TreeMap<>(new Comparator<Usr>() {
            @Override
            public int compare(Usr o1, Usr o2) {
                return (int)(o2.name.compareTo(o1.name));
            }
        });
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++");
        for(Usr u: users.keySet()){
            System.out.println(String.valueOf(u.age) + " : " + u.name + " - Value: " + String.valueOf(users.get(u)));
        }

        TreeSet<Usr> trS = new TreeSet<>();
        for (int i = 0; i < 10; i++){
            trS.add(new Usr("Name" + String.valueOf(i), (int)(Math.random()*100)));
        }
        for(Usr u: trS){
            System.out.println(String.valueOf(u.age) + " : " + u.name);
        }
        */
        /*-HashMap<Double, Double> hm = new HashMap<>();
        for (int i =0; i < 9;i++){
            hm.put((Math.random() *1000), (Math.random()*1000));
        }

        TreeMap<Double, Double> trm = new TreeMap<>(hm);

        for(Double key :  trm.keySet()){
            System.out.println(String.valueOf(key) + " : " + String.valueOf(trm.get(key)));
        }
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++");
        TreeMap<Double, Double> trm1 = new TreeMap<>(new Comparator<Double>() {
            @Override
            public int compare(Double o1, Double o2) {
                return (int)(o2 - o1);
            }
        });

        for (int i =0; i < 9;i++){
            trm1.put((Math.random() *1000), (Math.random()*1000));
        }
        for(Double key :  trm1.keySet()){
            System.out.println(String.valueOf(key) + " : " + String.valueOf(trm1.get(key)));
        }
        -*/
        /*-LinkedList<Integer> lList = new LinkedList<Integer>();
        ArrayList<Integer> aList = new ArrayList<Integer>();
        long start = System.nanoTime();

        for(int i=0; i < 1000;i++){
            lList.add(i);
        }
        long finish = System.nanoTime();
        float delta1 = (finish - start)%1000000;
        System.out.println("Delta1: " + String.valueOf(delta1));

        start = System.nanoTime();

        for(int i=0; i < 1000;i++){
            aList.add(i);
        }
        finish = System.nanoTime();
        float delta2 = (finish - start)%1000000;
        System.out.println("Delta2: " + String.valueOf(delta2));

        System.out.println("DELTA: " + String.valueOf(delta1 - delta2));
        -*/
        /*-

        String[] firstNames = new String[]{"Ivan","Petr","Sidor"};
        String[] secondNames = new String [] {"Ivanov","Petrov","Sidorov"};
        ArrayList<User> users = new ArrayList<>();
        while (true){
            int indexFirstName = (int)(Math.random()*3);
            int indexLastName = (int)(Math.random()*3);
            User usr = new User(firstNames[indexFirstName], secondNames[indexLastName]);
            if (users.contains(usr)){
                System.out.println("User " + usr.firstName + " "+ usr.lastName+" was found in list");
                break;
            }
            else{
                users.add(usr);
            }
        }
        //Iterator<User> iter = users.iterator();
        -*/
        /*-
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
        -*/

    }
}
