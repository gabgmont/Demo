package com.company.enemies;

public class Enemy {

    private String name;
    private int hitPoints;
    private int lives;

    public Enemy(String name, int hitPoints, int lives) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.lives = lives;
    }

    public void showInfo(){
        System.out.println("Name: " + getName() + " - Hit Points: " + getHitPoints() + " - Lifes:" + getLives());
    }

    public void takeDamage(int damage){
        if(damage < this.hitPoints) {
            setHitPoints(getHitPoints() - damage);
            System.out.println("\nTaken " + damage + " damage! Have " + getHitPoints() + " left.\n");
        }else{
            setLives(this.lives - 1);
            if(this.lives > 0) {
                System.out.println("\nI've lost a life. Have " + getLives() + " left.\n");
            }else{
                setHitPoints(0);
                System.out.println("\nI'm dead!\n");
            }
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public int getLives() {
        return lives;
    }

    public void setLives(int lives) {
        this.lives = lives;
    }
}
