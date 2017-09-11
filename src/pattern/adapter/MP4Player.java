package pattern.adapter;

public class MP4Player implements AdvancedMediaPlayer {
    @Override
    public void playMP4(){
        System.out.println("Play MP4");
    }

    @Override
    public void playMP5(){
        System.out.println("Invalid MP4 Player");
    }
}
