//package com.company;
//
//public class Main {
//
//    public static void main(String[] args) {
//
//        Player player = new Player("Roddoloco", "Rogue", "Alchemist");
//        System.out.println("Player Name: " + player.getName());
//        System.out.println("Class: " + player.getFunction());
//        System.out.println("Profession: " + player.getProfession());
//
//        player.setWeapon(new Weapon("Dagger", 8, 40));
////        System.out.println("Weapon: " + player.getWeapon().getWeaponName() + " - " + player.getWeapon().getDamage() + " Damage");
//        player.showWeapon();
//
//        Loot healthPotion = new Loot("Health Potion", LootType.POTION, 10);
//        player.pickUpLoot(healthPotion);
//
//        player.pickUpLoot(new Loot("Mana Potion", LootType.POTION, 8));
//        player.pickUpLoot(new Loot("Red Cape", LootType.ARMOR, 50));
//        player.pickUpLoot(new Loot("Stamina Ring", LootType.RING, 100));
//
//        player.showInventory();
//
////        Loot leatherArmor = new Loot("Leather armor", LootType.ARMOR, 150);
////        player.dropLoot(leatherArmor);
//        player.dropLoot(healthPotion);
//
//        player.showInventory();
//
//    }
//}
