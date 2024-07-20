package com.dio.iphone.user;

import com.dio.iphone.Iphone;
import com.dio.iphone.apps.ipod.Ipod;
import com.dio.iphone.apps.phone.Phone;
import com.dio.iphone.apps.safari.Safari;

public class User {
    public static void main(String[] args) {
        // create object Iphone
        Iphone iphone = new Iphone();

        Phone phone = iphone;
        Ipod ipod = iphone;
        Safari safari = iphone;

        System.out.println("\nSimulating user using the Phone: ");
        phone.call("(XX) XXXXXXX-XX");
        phone.answerCall();
        phone.startVoicemail();

        System.out.println("\nSimulating user using the Music Player: ");
        ipod.selectMusic("Run to the hills");
        ipod.play();
        ipod.pause();

        System.out.println("\nSimulating user using the Mobile Browser: ");
        safari.showPage("www.dio.me");
        safari.ReloadPage();
        safari.addNewTab();

    }
}
