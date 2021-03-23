package com.company;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

	Random number = new Random();
	int x = number.nextInt(999);
	System.out.println(x);
    }
}
