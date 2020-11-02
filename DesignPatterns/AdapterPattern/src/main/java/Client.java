import yy.player.AudioPlayer;
import yy.player.MediaPlayer;

public class Client {
    public static void main(String[] args) {

        MediaPlayer player = new AudioPlayer();

        player.play("Mp3");
        player.play("Mp4");
        player.play("Vlc");
    }
}
