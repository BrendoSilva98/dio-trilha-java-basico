public class SmartTv {
    boolean on = false;
    int channel = 1;
    int volume = 25;

    public void volumeUp(){
        System.out.println("Volume Up");
        volume++;
    }
    public void volumeDown(){
        System.out.println("Volume Down");
        volume--;
    }

    public void changeChannel(int newChannel){
        channel = newChannel;
    }
    public void channelUp(){
        channel++;
    }
    public void channelDown(){
        channel--;
    }



    public void turnOn(){
        on=true;
    }
    public void turnOff(){
        on=false;
    }
}
