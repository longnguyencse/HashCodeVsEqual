package com.gogowitczak;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by nqlong on 01-Aug-17.
 */

public class MyClass {

    private final String importantField;
    private final String anotherField;

    public MyClass(final String equalField, final String anotherField) {
        this.importantField = equalField;
        this.anotherField = anotherField;
    }

    public String getEqualField() {
        return importantField;
    }

    public String getAnotherField() {
        return anotherField;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result
                + ((importantField == null) ? 0 : importantField.hashCode() + anotherField.hashCode());
        System.out.println("result: " + result);
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
//        if (this == obj)
//            return true;
//        if (obj == null)
//            return false;
//        if (getClass() != obj.getClass())
//            return false;
//        final MyClass other = (MyClass) obj;
//        if (importantField == null) {
//            if (other.importantField != null)
//                return false;
//        } else if (!importantField.equals(other.importantField))
//            return false;
//        return true;
        return true;
    }

    public static void main(String[] args) {
//        String f = new String("a");
//        String f1 = new String("a");
//        String f2 = "a";
//        String f3 = "a";
//
//        System.out.println(f == f1);
//        System.out.println(f.equals(f1));
//        System.out.println(f.equals(f2));
//        System.out.println(f1 == f3);
//
//        System.out.println(f2.getBytes());
//        System.out.println(f3.getBytes());





        MyClass first = new MyClass("a","first");
        MyClass second = new MyClass("a","second");
        HashMap<MyClass, Integer> myMap = new HashMap<>();

        myMap.put(first, 1);

        myMap.put(second, 2);

        System.out.println(myMap.size());
        System.out.println(myMap.get(second));
        System.out.println(myMap.get(first));
//
//
//        System.out.println(first.equals(second));
//        System.out.println(first.hashCode());
//        System.out.println(second.hashCode());
    }
}
