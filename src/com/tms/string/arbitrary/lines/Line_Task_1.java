/**
 * Класс с реализацией поиска самого длинного и самого короткого слова в предложении. Task 1.
 */

package com.tms.string.arbitrary.lines;

public class Line_Task_1 {
    public static void main(String[] args) {
        String phrase = "It is like rocket science";
        String [] wordsInAPhrase = phrase.split(" ");
        String theShortestWord = wordsInAPhrase[wordsInAPhrase.length-1];
        String theLongestWord = wordsInAPhrase[0];

        for(int i = wordsInAPhrase.length-1; i>=0; i--){
            if(theShortestWord.length()>wordsInAPhrase[i].length()){
                theShortestWord = wordsInAPhrase[i];
            } else if(theLongestWord.length()<wordsInAPhrase[i].length()){
                theLongestWord = wordsInAPhrase[i];
            }
        }
        System.out.println("Самое короткое слово: " + theShortestWord);
        System.out.println("Самое длинное слово: " + theLongestWord);
    }
}
