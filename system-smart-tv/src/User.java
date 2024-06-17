public class User {
    public static void main(String[] args) throws Exception {
        
        SmartTv smartTv = new SmartTv();

        System.out.println("TV on? " + smartTv.on);
        System.out.println("Which channel: " + smartTv.channel);
        System.out.println("Sound volume: " + smartTv.volume);


        smartTv.changeChannel(12);
        System.out.println("New status -> Which channel: " + smartTv.channel);

        smartTv.volumeDown();
        smartTv.volumeDown();
        smartTv.volumeUp();
        System.out.println("New status -> Sound volume: " + smartTv.volume);
        
        smartTv.turnOn();
        System.out.println("New status -> TV on? " + smartTv.on);

        smartTv.turnOff();
        System.out.println("New status -> TV on? " + smartTv.on);

    }
}
