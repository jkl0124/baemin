package com.example.demo.etc;

import java.util.Scanner;
import lombok.extern.slf4j.Slf4j;


@Slf4j
public class StringBuilderDemo {

    public static void main(String[] args) {

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("asd");
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.next();
        String str2 = scanner.next();
    }

}
