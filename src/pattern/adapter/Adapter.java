package pattern.adapter;

public class Adapter implements BasicMediaPlayer{
    AdvancedMediaPlayer amp;

    public void play(String type){
        switch (type){
            case "MP4":
                amp = new MP4Player();
                amp.playMP4();
                break;
            case "MP5":
                amp = new MP5Player();
                amp.playMP5();
                break;
            default:
                break;
        }
    }
}
