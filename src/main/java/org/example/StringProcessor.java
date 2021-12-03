package org.example;


public class StringProcessor {

    //копирование строки N раз
    public static String copyLine(String s, int n) {
        String copy = "";
        if (n < 0) throw new IllegalArgumentException("n<0");
        if (n == 0) return copy;
        for (int i = 0; i < n; i++) copy += s;
        return copy;
    }

    // Количество вхождений второй строки в первую
    public static int getQuantityOfOccurrences(String first, String second) {
        int occurrences = 0;
        int i = first.indexOf(second);
        if (first == null || first.isEmpty()) throw new NullPointerException("1 строка пуста или Null ");
        if (second == null || second.isEmpty()) throw new NullPointerException("2 строка пуста или Null ");
        while (i >= 0) {
            occurrences++;
            i = first.indexOf(second, ++i);
        }
        return occurrences;
    }

    // замена символов 1,2,3
    public static String replaceSymbols(String inputStr) {
        inputStr = inputStr.replaceAll("1", "один");
        inputStr = inputStr.replaceAll("2", "два");
        inputStr = inputStr.replaceAll("3", "три");
        return inputStr;
    }

    //Удаление каждого второго символа в строке
    public static StringBuilder delSecondSymbol(StringBuilder inputStr) {
        int i = 0;
        while (i < inputStr.length() - 1) inputStr = inputStr.deleteCharAt(++i);
        return inputStr;
    }
    // реверс строки
    public static String reverse(String s) {
        char[] arr = s.toCharArray();
        String result = "";
        String[] words = s.split("(\\s)+");
        int j = 1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == ' ') {
                result = result + arr[i];
            } else {
                result = result + words[words.length - j];
                while (arr[i] != ' ') {
                    i++;
                }
                result = result + arr[i];
                j++;

            }

        }

        return result;

    }


}