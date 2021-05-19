/**
 * Класс, содержащий методы для работы с номером документа. Task 0.
 */

package com.tms.string.docnumber;

public class DocNumber {

    public static void printNumberBlocks(String s) {
        System.out.print(s.substring(0, 4) + "-");
        System.out.println(s.substring(9, 13));
    }

    public static void printDocNumberWithSubstitutes(String s) {
        String docNumberPart1 = s.substring(0, 17);
        String docNumberPart2 = s.substring(17, 22);
        System.out.println(docNumberPart1.replaceAll("[a-zA-Z]", "*") + docNumberPart2);
    }

    public static void printOnlyLettersLowerCase(String s) {
        String lettersOnly = s.substring(5, 8) + s.substring(14, 17) + s.substring(18, 22).replaceAll("[\\d]", "");
        StringBuilder stringBuilder = new StringBuilder(lettersOnly);
        stringBuilder.insert(3, "/");
        stringBuilder.insert(7, "/");
        stringBuilder.insert(9, "/");
        System.out.println(stringBuilder.toString().toLowerCase());
    }

    public static void printOnlyLettersUpperCase(String s) {
        StringBuilder capitalLettersInDocNumber = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isAlphabetic(ch)) {
                capitalLettersInDocNumber.append(ch);
            }
        }
        capitalLettersInDocNumber.insert(3, "/");
        capitalLettersInDocNumber.insert(7, "/");
        capitalLettersInDocNumber.insert(9, "/");
        System.out.println("Letters:" + capitalLettersInDocNumber.toString().toUpperCase());
    }

    public static void containsABCSequence(String s){
        String sequence = "abc";
        if(s.contains(sequence) || s.contains(sequence.toUpperCase())){
            System.out.println("Номер документа содержит последовательность abc");
        }else {
            System.out.println("Номер документа не содержит последовательность abc");
        }
    }

    public static void startsWithCertainNumbers(String s){
        if(s.startsWith("555")){
            System.out.println("Номер документа начинается с последовательности 555");
        }else{
            System.out.println("Номер документа не начинается с последовательности 555");
        }
    }

    public static void endsWithSequence(String s){
        String sequence = "1a2b";
        if(s.endsWith(sequence) || s.endsWith(sequence.toUpperCase())){
            System.out.println("Номер документа заканчивается последовательностью 1a2b");
        }else{
            System.out.println("Номер документа не заканчивается последовательностью 1a2b");
        }
    }
}