package com.company;
import java.util.*;
public class foreach {
    public static void main(String args[])
    {
//defining a List
        List<String> city = Arrays.asList("Boston", "San Diego", "Las Vegas", "Houston", "Miami", "Austin");
//iterate List using forEach
        city.forEach(System.out::println);
    }
}
