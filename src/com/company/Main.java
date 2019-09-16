package com.company;
import java.io.*;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws IOException{

        String fname;


        //PrintWriter outfile = new PrintWriter(fwriter);
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a file name for output");
        fname = input.nextLine();
        FileWriter fwriter = new FileWriter("names.txt", true);
        PrintWriter outfile = new PrintWriter(fname);
        String name;
        String choice = "yes";


        while(!(choice.equals("no"))){
            System.out.println("Enter a name to store in a file");
            name = input.nextLine();
            outfile.println(name);
            System.out.println("Do you want to add more names?");
            choice = input.nextLine();
        }
        outfile.close();
    }
}
