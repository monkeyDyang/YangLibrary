package yy.player;

public class AudioPlayer implements MediaPlayer {

    MediaAdapter mediaAdapter;

    public void play(String type) {

        if (type.equalsIgnoreCase("Mp3"))
            System.out.println("AudioPlayer play " + type);
        else if (type.equalsIgnoreCase("Vlc") || type.equalsIgnoreCase("Mp4")) {
            mediaAdapter = new MediaAdapter(type);
            mediaAdapter.play(type);
        }
        else{
            System.out.println("Invalid media. "+
                    type + " format not supported");
        }
    }
}
