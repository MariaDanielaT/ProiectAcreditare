package com.itfactory;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.Assert.assertFalse;

public class TriunghiTest {

    Triunghi triunghi;

    @Before
    public void setup() {
        triunghi = new Triunghi(2.2, 4.3, 3.4);
    }

    @Test
    public void ifIsOk(){
        double triunghiP = triunghi.perimetru();
        assertEquals(9.8999, triunghiP, 1);
    }

    @Test
    public void isTrue(){
        double triunghiP = triunghi.perimetru();
        assertTrue(triunghiP == 9.899999999999999);
    }

    @Test
    public void isNotNull(){
        double triunghiP = triunghi.perimetru();
        assertNotNull(triunghiP);
    }

    @Test
    public void isFalse(){
        double triunghiP = triunghi.perimetru();
        assertFalse(triunghiP == 12.3);
    }

}
