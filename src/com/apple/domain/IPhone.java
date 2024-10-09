package com.apple.domain;

import com.apple.interfaces.Browser;
import com.apple.interfaces.MusicPlayer;
import com.apple.interfaces.Phone;

public class IPhone implements MusicPlayer, Phone, Browser {

    @Override
    public void play() {
        System.out.println("Reproduzindo música");
    }

    @Override
    public void pause() {
        System.out.println("Pausando música");
    }

    @Override
    public void selectMusic(String music) {
        System.out.println("Selecionando música: " + music);
    }

    @Override
    public void load(String page) {
        System.out.println("Abrindo página: " + page);
    }

    @Override
    public void newTab() {
        System.out.println("Criando nova aba");
    }

    @Override
    public void refresh() {
        System.out.println("Atualizando página");
    }

    @Override
    public void call(String number) {
        System.out.println("Ligando para: " + number);
    }

    @Override
    public void answer() {
        System.out.println("Atendendo uma ligação");
    }

    @Override
    public void startVoiceMessage() {
        System.out.println("Iniciando um correio de voz");
    }
}
