package org.example;

public enum Weapon {
    SWORD(50, 1.5),
    KNIFE(75, 2.0),
    AXE(60, 1.25),
    DAGGER(80, 1.75);

    private final int damage;
    private final double attackSpeed;

    Weapon(int damage, double attackSpeed) {
        this.damage = damage;
        this.attackSpeed = attackSpeed;
    }

    public int getDamage() {
        return damage;
    }

    public double getAttackSpeed() {
        return attackSpeed;
    }
}
