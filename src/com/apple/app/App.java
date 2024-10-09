package com.apple.app;

import com.apple.domain.IPhone;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Olá, você está com seu iPhone pronto para uso");

        IPhone iPhone = new IPhone();
        iPhone.selectMusic("It's my life - Bon Jovi");
        iPhone.play();
        iPhone.pause();
    }
}
