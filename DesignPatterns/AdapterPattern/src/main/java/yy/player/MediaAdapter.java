package yy.player;

import yy.advanced.AdvancedMediaPlayer;
import yy.advanced.Mp4Player;
import yy.advanced.VlcPlayer;

public class MediaAdapter implements MediaPlayer {

    AdvancedMediaPlayer AdvancedMediaPlayer;

    public MediaAdapter(String type){
        if (type.equalsIgnoreCase("Vlc"))
            AdvancedMediaPlayer = new VlcPlayer();
        else if(type.equalsIgnoreCase( "Mp4"))
            AdvancedMediaPlayer = new Mp4Player();
    }

    public void play(String type) {
        if (type.equalsIgnoreCase("Vlc"))
            AdvancedMediaPlayer.playVlc(type);
        else if(type.equalsIgnoreCase( "Mp4"))
            AdvancedMediaPlayer.playMp4(type);

    }
}
