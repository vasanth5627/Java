package OOPS.InterfaceDemo;

public class NiceCar {
    private Engine engine;
    private Media mediaPlayer;

    public  NiceCar(){
        engine = new PowerEngine();
        mediaPlayer = new CDPlayer();
    }

    public NiceCar(Engine engine, CDPlayer mediaPlayer) {
        this.engine = engine;
        this.mediaPlayer = mediaPlayer;
    }

    public void start(){
        engine.start();
    }
    public void stop(){
        engine.stop();
    }

    public void startMusic(){
        mediaPlayer.start();
    }

    public void stopMusic(){
        mediaPlayer.stop();
    }

    public void upgradeEngine(){
        this.engine=new ElectricEngine();
    }
}
