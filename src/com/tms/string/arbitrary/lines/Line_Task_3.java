/**
 * Класс с реализацией проверки является ли слово под введенным номером палиндромом
 * Возник вопрос, что не получилось написать предупреждение, если введено не число (строка, например)
 * ставила else, но оно срабатывало правильно только при первой попытке ввода, если попытка была не изначальная, то выбрасывало ошибку
 */

package com.tms.string.arbitrary.lines;
import java.util.Scanner;

public class Line_Task_3 {
    public static void main(String[] args) {

        String phrase = "Ваш довод крайне убедителен";
        String[] dividedPhrase = phrase.split(" ");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите позицию числа для проверки является ли слово палиндромом");
        int wordPosition;
        if (scanner.hasNextInt()) {
            do {
                wordPosition = scanner.nextInt();
                if(wordPosition >= dividedPhrase.length || wordPosition<0){
                    System.out.println("Вы ввели неподходящее число, попробуйте еще раз");
                }
            } while (wordPosition >= dividedPhrase.length || wordPosition<0);
            String searchedWord = dividedPhrase[wordPosition];
            if (isSearchedWordPalindrome(searchedWord)) {
                System.out.println("Слово на искомой позиции (" + searchedWord + ") является палиндромом");
            } else {
                System.out.println("Слово на искомой позиции (" + searchedWord + ") не является палиндромом");
            }
        }
    }

    public static boolean isSearchedWordPalindrome(String searchedWord){
        return searchedWord.equals(new StringBuilder(searchedWord).reverse().toString());
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
