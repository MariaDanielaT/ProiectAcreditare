package com.itfactory;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DreptunghiTest {
    Dreptunghi dreptunghi;

    @Before
    public void setup() {
        dreptunghi = new Dreptunghi(2.3, 4.3);
    }

    @Test
    public void ifIsOk(){
        double dreptunghiP = dreptunghi.perimetru();
        assertEquals(13.2, dreptunghiP, 1);
    }

    @Test
    public void isTrue(){
        double dreptunghiP = dreptunghi.perimetru();
        assertTrue(dreptunghiP == 13.2);
    }

    @Test
    public void isNotNull(){
        double dreptunghiP = dreptunghi.perimetru();
        assertNotNull(dreptunghiP);
    }

    @Test
    public void isFalse(){
        double dreptunghiP = dreptunghi.perimetru();
        assertFalse(dreptunghiP == 12.3);
    }
//    @Test
//    public void isNull(){
//        double dreptunghiP = dreptunghi.perimetru();
//        assertNull(dreptunghiP);
//    }

}
