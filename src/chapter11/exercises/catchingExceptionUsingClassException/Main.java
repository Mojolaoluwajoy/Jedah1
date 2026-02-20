package chapter11.exercises.catchingExceptionUsingClassException;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        try {
            throw new ExceptionA("ExceptionA ");
        }
        catch (Exception exception){
            System.out.println("ExceptionA handled");
        }
        try {
            throw new ExceptionA("Exception B");
        }
        catch (Exception exception){
            System.out.println("ExceptionB handled");
        }
        try {
            throw new NullPointerException("NullP0inter exception ");
        }
        catch (Exception exception){
            System.out.println(" NullPointer Exception handled");
        }
        try {
            throw new IOException("IO exception ");
        }
        catch (Exception exception){
            System.out.println("IO Exception handled");
        }
    }
}
