package test;

import main.MainClass;
import org.junit.Assert;
import org.junit.Test;

public class MainClassTest {

    @Test
    public void testGetLocalNumber() {
        MainClass mainClass = new MainClass();
        int expected = 14;
        Assert.assertEquals("Wrong number!", expected, mainClass.getLocalNumber());
    }

    @Test
    public void testGetClassNumber() {
        MainClass mainClass = new MainClass();
        Assert.assertTrue("Number less than 45", mainClass.getClassNumber() > 45);
    }

    @Test
    public void testGetClassString() {
        MainClass mainClass = new MainClass();
        Assert.assertTrue("The string does not contains \"hello\" or \"Hello\"",
                mainClass.getClassString().contains("hello")
                        || mainClass.getClassString().contains("Hello"));
    }
}
