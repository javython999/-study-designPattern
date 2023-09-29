package study.designpattern.structuralpattern.adapter.example;

import java.util.*;

public class AdapterExampleInJava {
    public static void main(String[] args) {
        // array to List
        List<String> strings = Arrays.asList("a", "b", "c");

        // List to Enumeration
        Enumeration<String> enumeration = Collections.enumeration(strings);

        // Enumeration to List
        ArrayList<String> list = Collections.list(enumeration);
    }
}
