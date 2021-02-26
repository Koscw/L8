package com.hw.algorithm;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Algorithm {
    public static void sort(String[] array) {
        /*
        for (int i = 0; i < array.length; i++) {
            Collections.sort(list, Comparator.reverseOrder());
            String q = null;
            int n = 0;
            if (isNumber(array[i])) {
                for (int j = 1; j < array.length; j++) {
                    if (isNumber(array[j]) && Integer.parseInt(array[i]) > Integer.parseInt(array[j])) {
                        n = Integer.parseInt(array[i]);
                        array[i] = String.valueOf(Integer.parseInt(array[j]));
                        array[j] = String.valueOf(n);
                    }

                }

            }
        }

         */
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<String>  q = new ArrayList<>();
        for (String l : array) {
            if (isNumber(l)) {
               int n = Integer.parseInt(l);
                list.add(n);
            } else {
                q.add(l);
            }

        }

        for (int i = 1; i < q.size(); i++) {
            for (int j = 1; j < q.size() - i + 1; j++) {
                if (isGreaterThan(q.get(j - 1), q.get(j))) {
                    String tmp = q.get(j - 1);
                    q.set(j - 1, q.get(j));
                    q.set(j, tmp);
                }
            }
        }

        Collections.sort(list, Comparator.reverseOrder());
        int n = 0, j = 0;
        for (int i = 0;i < array.length;i++ ){
            if (isNumber(array[i])){
                array[i] = list.get(n).toString();
                n++;
            }
            else{
                array[i] = q.get(j);
                j++;
            }
        }




    }

    public static boolean isGreaterThan(String a, String b) {
        return a.compareTo(b) > 0;
    }

    public static boolean isNumber(String s) {
        if (s.length() == 0) {
            return false;
        }
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char l = chars[i];
            if ((l == '-' && i != 0) || (!Character.isDigit(l) && l != '-') || (i == 0 && l == '-' && chars.length == 1)) {
                return false;
            }

        }
        return true;
    }
}

