package com.sparta.jk;

public class Main {
    public static void main(String[] args) {
        AnagramChecker anagramChecker = new AnagramChecker();
        System.out.println(anagramChecker.isAnagram("Listen", "Silent")); //prints true if inputs are anagrams
    }
}
