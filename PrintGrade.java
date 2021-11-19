
///This is for file i/o
import java.io.IOException;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;
import java.io.*;
import java.math.RoundingMode;
import java.text.DecimalFormat;

class PrintGrade {
  private static final DecimalFormat df = new DecimalFormat("0.00");

 
   void calcAvg(){
    try {
      FileWriter myWriter = new FileWriter("filename.txt", true);
      Scanner input = new Scanner(System.in);
      System.out.print("Enter your name: ");

      String name = input.nextLine();

      System.out.print("Enter your student ID: ");

      int id = input.nextInt();

      System.out.println("Welcome, " + name.toUpperCase() + ", to the MP Mark Converter App.");

      System.out.println("How many courses did you take this semester? (Max num of 10 items) ");

      int n = input.nextInt();
      int[] a = new int[n];
      double sum = 0.0;
      double average = 0.0;

      for (int i = 0; i < n; i++) {
        System.out.println("Enter your percent marks: ");
        a[i] = input.nextInt();
         sum = sum + a[i];
        myWriter.write(System.getProperty("line.separator"));
        myWriter.write(Integer.toString(a[i]));
      }

     average = sum/(double) n; 
      System.out.println("Your average is: " + df.format(average) + "%" );

      myWriter.close();
    } catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }

  }
}