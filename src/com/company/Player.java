package com.company;

import java.util.ArrayList;

public class Player {

    private String name;
    private String function;
    private String profession;
    private Weapon weapon;
    private ArrayList<Loot> inventory;

    public Player(String name, String function, String profession) {
        this.name = name;
        this.function = function;
        this.profession = profession;
        this.weapon = Weapon.setDefaultWeapon();
        inventory = new ArrayList();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFunction() {
        return function;
    }

    public void setFunction(String function) {
        this.function = function;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public Weapon getWeapon() {
        return weapon;
     }

    public void showWeapon (){
        System.out.println("Weapon: " + weapon.getWeaponName() + " - " + weapon.getDamage() + " Damage");
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public ArrayList<Loot> getInventory() {
        return inventory;
    }

//    public void setInventory(ArrayList<Loot> inventory) {
//        this.inventory = inventory;
//    }

    public void pickUpLoot(Loot item){
        inventory.add(item);
    }

    public void dropLoot(Loot item){
        if(this.inventory.contains(item)){
            inventory.remove(item);
            System.out.println("\nThe item " + item.getName() + " was dropped!");
        }else System.out.println("\nThere is no " + item.getName() + " in your bag!");
    }

    public void showInventory(){
        System.out.println("\nInventory:");
        for(Loot item : inventory){
            System.out.println(item.getName());
        }
    }
}
