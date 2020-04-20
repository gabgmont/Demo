package com.company;

public class Weapon {

    private String weaponName;
    private int damage;
    private int hitPoints;

    public Weapon(String weaponName, int damage, int hitPoints) {
        this.weaponName = weaponName;
        this.damage = damage;
        this.hitPoints = hitPoints;
    }

    public String getWeaponName() {
        return weaponName;
    }

    public void setWeaponName(String weaponName) {
        this.weaponName = weaponName;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    static public Weapon setDefaultWeapon(){
        Weapon sword = new Weapon("Sword", 10, 50);
        return sword;
    }
}
