
///This is for file i/o
import java.io.IOException;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;
import java.io.*;
import java.math.RoundingMode;
import java.text.DecimalFormat;

class PrintGrade {
   //This is just formatting for the average
   //Makes sure that it is to two decimal places
  private static final DecimalFormat df = new DecimalFormat("0.00");

 
   void calcAvg(){
    try {
      FileWriter myWriter = new FileWriter("filename.txt", true);
      Scanner input = new Scanner(System.in);
      System.out.print("Enter your name: ");

      String name = input.nextLine();
      //This writes the student's name to the text file
      myWriter.write("Student Name: "+ name);
      //Put's the next input on a different line
       myWriter.write(System.getProperty("line.separator"));

      System.out.print("Enter your student ID: ");

      int id = input.nextInt();
      //Writes the student's id in the text file
      myWriter.write("Student ID: "+ id);  
      //puts the next input on a different line
      myWriter.write(System.getProperty("line.separator"));


      System.out.println("Welcome, " + name.toUpperCase() + ", to the MP Mark Converter App.");

      System.out.println("How many courses did you take this semester? (Max num of 10 items) ");
       

      int n = input.nextInt();
      //Writes the number of courses taken in the semester 
      //on a different line
      myWriter.write("Number of courses taken this semester: "+ n);
      //puts the next input on a different line
       myWriter.write(System.getProperty("line.separator"));

      int[] a = new int[n];
      double sum = 0.0;
      double average = 0.0;

      for (int i = 0; i < n; i++) {
        System.out.println("Enter your percent marks: ");
        a[i] = input.nextInt();
         sum = sum + a[i];
         //puts the next input on a different line
        myWriter.write(System.getProperty("line.separator"));
        //Writes the student's average in the text file
        myWriter.write("Your mark is: "+Integer.toString(a[i])+ "%");
      }

      average = sum/(double) n; 
      String newAverage = df.format(average);
      System.out.println("Your average is: " + newAverage + "%" );
    
       myWriter.write(System.getProperty("line.separator"));
      myWriter.write("Your average mark is: "+ newAverage +"%");
      myWriter.write(System.getProperty("line.separator"));
      myWriter.close();
    } catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }

  }
}