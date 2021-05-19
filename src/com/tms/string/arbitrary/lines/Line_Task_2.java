/**
 * Класс с реализацией поиска слова с минимальным количеством различных символов. Task 2.
 */

package com.tms.string.arbitrary.lines;

public class Line_Task_2 {
    public static void main(String[] args) {
        String phrase = "id3t67h 12frt h67 ff1ioj zz1z i7g5s ff3f";
        String [] dividedPhrase = phrase.split(" ");
        String searchedWord = dividedPhrase[0];
        for (String word : dividedPhrase) {
            if (searchedWord.chars().distinct().count() > word.chars().distinct().count()) {
                searchedWord = word;
            }
        }
        System.out.println(searchedWord);
    }
}
