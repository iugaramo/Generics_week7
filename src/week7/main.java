package week7;

import week7.Domain.OrderedList;
import week7.Domain.SortedList;
import week7.Interface.IRepository;

public class main {
    public static void main(String[] args) {
        System.out.println("------ORDERED LIST------");
        System.out.println("*Integer");

        IRepository<Integer> ordered1 = new OrderedList<>();
        ordered1.save(5);
        ordered1.save(6);
        ordered1.save(3);
        ordered1.save(4);
        ordered1.remove(6);
        System.out.println("The size of the list is: " + ordered1.count());
        System.out.println("The elements from the ordered list are: ");
        ordered1.listAll();

        System.out.println(" ");
        System.out.println("*String");
        IRepository<String> ordered2 = new OrderedList<>();
        ordered2.save("Apple");
        ordered2.save("Pear");
        ordered2.save("Banana");
        ordered2.save("Kiwi");
        ordered2.remove("Kiwi");
        System.out.println("The size of the list is: " + ordered2.count());
        System.out.println("The elements from the ordered list are: ");
        ordered2.listAll();

        System.out.println(" ");
        System.out.println("------SORTED LIST------");
        System.out.println("*Integer");
        IRepository<Integer> sorted1 = new SortedList<>();
        sorted1.save(5);
        sorted1.save(6);
        sorted1.save(3);
        sorted1.save(4);
        sorted1.remove(6);
        System.out.println("The size of the list is: " + sorted1.count());
        System.out.println("The elements from the sorted list are: ");
        sorted1.listAll();

        System.out.println(" ");
        System.out.println("*String");
        IRepository<String> sorted2 = new SortedList<>();
        sorted2.save("Apple");
        sorted2.save("Pear");
        sorted2.save("Banana");
        sorted2.save("Kiwi");
        sorted2.remove("Kiwi");
        System.out.println("The size of the list is: " + sorted2.count());
        System.out.println("The elements from the ordered list are: ");
        sorted2.listAll();


    }
}
