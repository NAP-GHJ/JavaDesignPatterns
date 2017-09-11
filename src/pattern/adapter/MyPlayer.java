package pattern.adapter;

public class MyPlayer implements BasicMediaPlayer {
    Adapter adapter;

    MyPlayer(){
        adapter = new Adapter();
    }

    public void play(String type){
        switch(type){
            case "MP3":
                System.out.println("Play MP3");
                break;
            case "MP4":
                adapter.play("MP4");
                break;
            case "MP5":
                adapter.play("MP5");
                break;
            default:
                System.out.println("Invalid Play Type");
        }

    }

    public static void main(String [] args){
        MyPlayer mp = new MyPlayer();
        mp.play("MP3");
        mp.play("MP4");
        mp.play("MP5");
    }

}
