package com.serenitydojo;

import org.junit.Assert;
import org.junit.Test;

public class CreatingADogTest {

    @Test
    public void creating_a_dog() {
        Dog fido = new Dog("Fido","Bone", 5, false);
        Assert.assertEquals(fido.getName(), "Fido");
        Assert.assertEquals(fido.getFavoriteToy(), "Bone");
        Assert.assertEquals(fido.getAge(), 5);
    }
}
