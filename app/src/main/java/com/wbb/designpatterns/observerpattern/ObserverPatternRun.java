package com.wbb.designpatterns.observerpattern;

public class ObserverPatternRun {

    public static void main(String[] args) {
        Player player = new Player();
        player.setObserver(new MolaObserver());
        player.setObserver(new GoprObserver());

        player.aCopyThePlay();
    }

}
