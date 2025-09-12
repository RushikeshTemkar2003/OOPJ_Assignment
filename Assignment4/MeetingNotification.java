/*
Problem 15: Meeting Notification
Scenario: A corporate meeting scheduler needs to build complete meeting notifications by adding time
and location details to basic meeting announcements.
Task: Use StringBuffer to create detailed meeting notifications.
*/
public class MeetingNotification {

  public static void main(String[] args) {

    String baseText = "Meeting:";
    String toAppend = " Friday at 5 PM";

    StringBuffer notification = new StringBuffer(baseText);

    notification.append(toAppend);

    System.out.println(notification.toString());

  }

}
/*
C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M2_OOPs\OOPJ_Assignment4>javac MeetingNotification.java

C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M2_OOPs\OOPJ_Assignment4>java MeetingNotification
Meeting: Friday at 5 PM
*/