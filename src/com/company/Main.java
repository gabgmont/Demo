package com.company;

import com.company.enemies.Troll;
import com.company.enemies.Vampire;
import com.company.enemies.VampireKing;

public class Main {

    public static void main(String[] args) {

//        Troll troll = new Troll ("Big Troll");
//        troll.showInfo();
//        troll.takeDamage(30);
//        troll.showInfo();

//        Vampire vampire = new Vampire ("Dracula");
//        vampire.showInfo();
//        vampire.takeDamage(40);
//        vampire.showInfo();

        VampireKing vampireKing = new VampireKing("Vampire King");
        vampireKing.showInfo();
        vampireKing.takeDamage(100);
        vampireKing.showInfo();
    }
}
