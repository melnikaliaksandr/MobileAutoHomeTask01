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
}
