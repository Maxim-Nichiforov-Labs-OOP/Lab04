package com.company;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) throws FileNotFoundException {


        File file1 = new File("one_expression.txt");
        File file2 = new File("three_expressions.txt");

        System.out.println("-------- File 1 --------");
        Scanner scanner1 = new Scanner(file1);
        int lineCount = 1;
        while (scanner1.hasNextLine()) {
            System.out.print("line " + lineCount + ": ");
            System.out.println(BracketsChecker.CheckBrackets(scanner1.nextLine()));
            lineCount++;
        }

        System.out.println("\n-------- File 2 --------");
        Scanner scanner2 = new Scanner(file2);
        lineCount = 1;
        while (scanner2.hasNextLine()) {
            System.out.print("line " + lineCount + ": ");
            System.out.println(BracketsChecker.CheckBrackets(scanner2.nextLine()));
            lineCount++;
        }

    }
}
