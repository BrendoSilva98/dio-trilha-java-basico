
package com.dio.iphone;

import com.dio.iphone.apps.ipod.Ipod;
import com.dio.iphone.apps.phone.Phone;
import com.dio.iphone.apps.safari.Safari;

public class Iphone implements Phone, Ipod, Safari {
    // Phone implementation
    public void call(String number) {
        System.out.println("Calling number: " + number);
    }

    public void answerCall() {
        System.out.println("Answering call");
    }

    public void startVoicemail() {
        System.out.println("Starting Voicemail");
    }

    // Ipod implementation
    public void play() {
        System.out.println("Playing Music");
    }

    public void pause() {
        System.out.println("Pausing Music");
    }

    public void selectMusic(String music) {
        System.out.println("Selecting Music: " + music);
    }

    // Safari implementation
    public void showPage(String url) {
        System.out.println("Showing Page: " + url);
    }

    public void addNewTab() {
        System.out.println("Adding NewTab");
    }

    public void ReloadPage() {
        System.out.println("Reloading Page");
    }

}
