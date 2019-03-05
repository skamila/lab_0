package edu.iis.mto.lab_0;

import java.util.ArrayList;
import java.util.List;

public class TailsGenerator {

    public List<String> tails(String value) {

        ArrayList<String> substrings = new ArrayList<>();

        if (value == null) {
            return substrings;
        }

        for (int i = 0; i < value.length(); i++) {
            substrings.add(value.substring(i));
        }

        substrings.add("");

        return substrings;

    }

}
