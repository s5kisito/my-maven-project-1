// MainTest.java
package com.mycompany;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class MainTest {
    @Test
    public void testMain() {
        assertEquals("Hello, Maven!", Main.getMessage());
    }
}

