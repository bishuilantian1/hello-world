package cn.dan.spring.demo.model;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;


public class BossListImpl implements List{
    private List list;

    public int size() {
        System.out.println("call the method size()");
        return list.size();
    }

    public boolean isEmpty() {
        // TODO Auto-generated method stub
        return false;
    }

    public boolean contains(Object o) {
        // TODO Auto-generated method stub
        return false;
    }

    public Iterator iterator() {
        // TODO Auto-generated method stub
        return null;
    }

    public Object[] toArray() {
        // TODO Auto-generated method stub
        return null;
    }

    public Object[] toArray(Object[] a) {
        // TODO Auto-generated method stub
        return null;
    }

    public boolean add(Object e) {
        // TODO Auto-generated method stub
        return false;
    }

    public boolean remove(Object o) {
        // TODO Auto-generated method stub
        return false;
    }

    public boolean containsAll(Collection c) {
        // TODO Auto-generated method stub
        return false;
    }

    public boolean addAll(Collection c) {
        // TODO Auto-generated method stub
        return false;
    }

    public boolean addAll(int index, Collection c) {
        // TODO Auto-generated method stub
        return false;
    }

    public boolean removeAll(Collection c) {
        // TODO Auto-generated method stub
        return false;
    }

    public boolean retainAll(Collection c) {
        // TODO Auto-generated method stub
        return false;
    }

    public void clear() {
        // TODO Auto-generated method stub
        
    }

    public Object get(int index) {
        // TODO Auto-generated method stub
        return null;
    }

    public Object set(int index, Object element) {
        // TODO Auto-generated method stub
        return null;
    }

    public void add(int index, Object element) {
        // TODO Auto-generated method stub
        
    }

    public Object remove(int index) {
        // TODO Auto-generated method stub
        return null;
    }

    public int indexOf(Object o) {
        // TODO Auto-generated method stub
        return 0;
    }

    public int lastIndexOf(Object o) {
        // TODO Auto-generated method stub
        return 0;
    }

    public ListIterator listIterator() {
        // TODO Auto-generated method stub
        return null;
    }

    public ListIterator listIterator(int index) {
        // TODO Auto-generated method stub
        return null;
    }

    public List subList(int fromIndex, int toIndex) {
        // TODO Auto-generated method stub
        return null;
    }

    
    public List getList() {
        return list;
    }

    
    public void setList(List list) {
        this.list = list;
    }
    
    

}
