package com.company;

enum LootType {POTION, ARMOR, RING}

public class Loot {
    private String name;
    private LootType lootType;
    private int value;

    public Loot(String name, LootType lootType, int value) {
        this.name = name;
        this.lootType = lootType;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LootType getLootType() {
        return lootType;
    }

    public void setLootType(LootType lootType) {
        this.lootType = lootType;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
