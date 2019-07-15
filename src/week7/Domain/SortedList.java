package week7.Domain;


import week7.Interface.IRepository;

import java.util.Set;
import java.util.TreeSet;

public class SortedList<T> implements IRepository<T> {
    Set<T> list2 = new TreeSet<>();

    @Override
    public void save(T obj) {
        list2.add(obj);

    }

    @Override
    public void remove(T obj) {
        list2.remove(obj);

    }

    @Override
    public int count() {
        return list2.size();
    }

    @Override
    public Set<T> listAll() {
        System.out.println(list2);
        return null;
    }
}