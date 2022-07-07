interface engine{
    void stop();
    void start();
}
interface media{
    void stop();
    void start();
}
class PowerEngine{
    void start(){
        System.out.println("Start the Power engine");
    }
    void stop(){
        System.out.println("Stop the Power engine");
    }
}
class MediaPlayer{
    void start(){
        System.out.println("Start the Media Player");
    }
    void stop(){
        System.out.println("Stop the Media Player");
    }
}
class car{
    PowerEngine myEngine;
    MediaPlayer myplayer;
    car(){
    myEngine=new PowerEngine();
    myplayer=new MediaPlayer();
    }
    void startMusic(){
        myplayer.start();
    }
    void stopMusic(){
        myplayer.stop();
    }
    void startEngine(){
        myEngine.start();
    }
    void stopEngine(){
        myEngine.stop();
    }
}
public class Main
{
	public static void main(String[] args) {
		car Maruti=new car();
		Maruti.startEngine();
		Maruti.stopEngine();
		Maruti.startMusic();
		Maruti.stopMusic();
	}
}
