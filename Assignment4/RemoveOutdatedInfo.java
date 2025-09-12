/*
Problem 17: Remove Outdated Information
Scenario: An academic system maintains course information that includes year details. When information
becomes outdated, the year needs to be removed.
Task: Use StringBuffer to remove outdated information.
*/
public class RemoveOutdatedInfo {

  public static void main(String[] args) {
    
    String originalText = "CDAC Kharghar 2024";
    String toDelete = "2024";

    StringBuffer info = new StringBuffer(originalText);

    int start = info.indexOf(toDelete);

    if(start != -1){
      info.delete(start, start + toDelete.length());
    }

    System.out.println(info.toString().trim());

  }

}
/*

C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M2_OOPs\OOPJ_Assignment4>javac RemoveOutdatedInfo.java

C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M2_OOPs\OOPJ_Assignment4>java RemoveOutdatedInfo
CDAC Kharghar
*/
