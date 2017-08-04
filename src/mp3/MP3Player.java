package mp3;

import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import mp3.entity.Player1;

import java.io.File;

public class MP3Player {
    public static void main(String[] args) throws InterruptedException {
        String bip = "bip.mp3";
        Media hit = new Media(new File(bip).toURI().toString());
        MediaPlayer mediaPlayer = new MediaPlayer(hit);
        mediaPlayer.play();


        Thread.sleep(10000);

        mediaPlayer.play();
        Thread.sleep(10000);

        // mediaPlayer.

        Player1 p1 = new Player1(100);

        int price = p1.getPrice();
    }
}
