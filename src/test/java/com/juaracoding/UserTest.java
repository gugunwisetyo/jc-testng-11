package com.juaracoding;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class UserTest {
    private User user;

    @BeforeClass
    public void setUp() {
        user = new User("Gugun", true, 1000.0);
    }

    @Test
    public void testGetName() {
        Assert.assertEquals(user.getName(), "Gugun");
    }

    @Test
    public void testSetName() {
        user.setName("Wisetyo");
        Assert.assertEquals(user.getName(), "Wisetyo");
    }

    @Test
    public void testIsActive() {
        Assert.assertTrue(user.isActive());
    }

    @Test
    public void testSetActive() {
        user.setActive(false);
        Assert.assertFalse(user.isActive());
    }

    @Test
    public void testGetSalary() {
        Assert.assertEquals(user.getSalary(), 1000.0);
    }

    @Test
    public void testSetSalary() {
        user.setSalary(1500.0);
        Assert.assertEquals(user.getSalary(), 1500.0);
    }
}
