/*
Problem 16: Room Allocation Update
Scenario: A facility management system assigns rooms to different activities and needs to insert building
information into existing room numbers.
Task: Use StringBuffer to update room allocation information.
*/
public class RoomAllocation {

  public static void main(String[] args) {

    String originalText = "101";
    String toInsert = "New Building ";
    int insertIndex = 0;

    StringBuffer roomInfo = new StringBuffer(originalText);

    roomInfo.insert(insertIndex, toInsert);

    System.out.println(roomInfo.toString());

  }

}

/*

C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M2_OOPs\OOPJ_Assignment4>javac RoomAllocation.java

C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M2_OOPs\OOPJ_Assignment4>java RoomAllocation
New Building 101
*/