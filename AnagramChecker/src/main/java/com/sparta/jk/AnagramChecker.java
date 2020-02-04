package com.sparta.jk;

import java.util.ArrayList;
import java.util.Collections;

public class AnagramChecker {
    public boolean isAnagram(String string1, String string2) {
        string1 = string1.toLowerCase(); //ignores case
        string2 = string2.toLowerCase();
        ArrayList<Character> charList1 = getArrayListOfString(string1); //turn string inputs into Character arrayLists
        ArrayList<Character> charList2 = getArrayListOfString(string2);
        Collections.sort(charList1); //sort arrayLists
        Collections.sort(charList2);
        return (charList1.equals(charList2)); //return true if arrayLists are same, else false
    }

    private ArrayList<Character> getArrayListOfString(String str) { //turns String input into Character arrayList
        ArrayList<Character> returnableList = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            returnableList.add(str.charAt(i));
        }
        return returnableList;
    }
}
