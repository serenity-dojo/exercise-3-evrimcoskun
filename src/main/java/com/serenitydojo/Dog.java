package com.serenitydojo;

public class Dog {
    private final String name;
    private final String favoriteToy;
    private final int age;
    private boolean isFed;

    static String DOG_NOISE = "Woof";

    public Dog(String name, String favoriteToy, int age, boolean isFed) {
        this.name = name;
        this.favoriteToy = favoriteToy;
        this.age = age;
        this.isFed = isFed;
    }

    public String makeNoise() { return DOG_NOISE; }

    public boolean feed() {
        return isFed = true;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getFavoriteToy() {
        return favoriteToy;
    }
}
