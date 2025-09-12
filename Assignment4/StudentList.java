/*
Problem 7: Student List
Scenario: A school management system tries to load a student list from a file at the beginning of each
semester. Sometimes the file might not exist or be corrupted.
Task: Simulate file reading operation and handle FileNotFoundException
*/
import java.io.*;

public class StudentList {

 public static void main(String[] args) {

  try {
   FileReader fr = new FileReader("student_list.txt");
   BufferedReader br = new BufferedReader(fr);
   String line;
   while((line = br.readLine()) != null) {
    System.out.println(line);
   }
   br.close();
   fr.close();

  } catch(FileNotFoundException e){
   System.out.println("File not found");
  } catch(IOException e){
   System.out.println("Some IO Error");
  }

 }

}
/*
C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M2_OOPs\OOPJ_Assignment4>javac StudentList.java

C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M2_OOPs\OOPJ_Assignment4>java StudentList
File not found
*/