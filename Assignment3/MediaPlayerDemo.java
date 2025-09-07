/*
25. Media Player
Scenario: A media player can play both Audio and Video files.
Problem Statement:
● Interface AudioPlayer → method playAudio(String song)
● Interface VideoPlayer → method playVideo(String movie)
● Class MediaPlayer implements both → provides implementation for both methods
*/
interface AudioPlayer {
   void playAudio(String song);
}

interface VideoPlayer {
   void playVideo(String movie);
}

class MediaPlayer implements AudioPlayer, VideoPlayer {
   @Override
   public void playAudio(String song) {
       System.out.println("Playing Audio: " + song);
   }

   @Override
   public void playVideo(String movie) {
       System.out.println("Playing Video: " + movie);
   }
}

public class MediaPlayerDemo {
    public static void main(String[] args) {
      MediaPlayer player = new MediaPlayer();
      player.playAudio("Shape of You");
      player.playVideo("Inception");
    }
}
/*
C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M2_OOPs\OOPJ_Assignment3>javac MediaPlayerDemo.java

C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M2_OOPs\OOPJ_Assignment3>java MediaPlayerDemo
Playing Audio: Shape of You
Playing Video: Inception
*/

