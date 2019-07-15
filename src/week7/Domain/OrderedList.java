package week7.Domain;


import week7.Interface.IRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class OrderedList<T> implements IRepository<T> {
    List<T> list1 = new ArrayList<>();

    @Override
    public void save(T obj) {
        list1.add(obj);

    }

    @Override
    public void remove(T obj) {
        list1.remove(obj);

    }

    @Override
    public int count() {
        return list1.size();
    }

    @Override
    public Set<T> listAll() {
        System.out.println(list1);
        return null;
    }
}