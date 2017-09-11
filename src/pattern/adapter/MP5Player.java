package pattern.adapter;

public class MP5Player implements AdvancedMediaPlayer {
    @Override
    public void playMP4(){
        System.out.println("Invalid MP5 Player");
    }

    @Override
    public void playMP5(){
        System.out.println("Play MP5");
    }

}
