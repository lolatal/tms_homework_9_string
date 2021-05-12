/**
 * Класс с реализацией методов для вводимого из консоли номера документа. Task 0.
 * Можно скопировать данную строку в консоль для проверки: 5554-hSd-5678-ABC-3F4c
 */

package com.tms.string.docnumber;


import java.util.Scanner;

public class DocumentDemo {
    public static void main(String[] args) {
        System.out.println("Введите номер документа: ");
        Scanner scanner = new Scanner(System.in);
        String inputDocNumber = scanner.next();
        System.out.println("Два первых блока по четыре цифры:");
        DocNumber.printNumberBlocks(inputDocNumber);
        System.out.println("Блоки из трех букв заменены на *:");
        DocNumber.printDocNumberWithSubstitutes(inputDocNumber);
        System.out.println("Только строчные буквы с разделителем:");
        DocNumber.printOnlyLettersLowerCase(inputDocNumber);
        System.out.println("Только заглавные буквы с разделителем: ");
        DocNumber.printOnlyLettersUpperCase(inputDocNumber);
        System.out.println("Проверка на наличие последовательностей в строке: ");
        DocNumber.containsABCSequence(inputDocNumber);
        DocNumber.startsWithCertainNumbers(inputDocNumber);
        DocNumber.endsWithSequence(inputDocNumber);
    }
}
