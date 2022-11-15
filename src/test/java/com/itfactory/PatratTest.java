package com.itfactory;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.Assert.assertFalse;

public class PatratTest {

   Patrat patrat;

    @Before
    public void setup() {
        patrat = new Patrat(2.2);
    }

    @Test
    public void ifIsOk(){
        double patratP = patrat.perimetru();
        assertEquals(4.4, patratP, 1);
    }

    @Test
    public void isTrue(){
        double patratP = patrat.perimetru();
        assertTrue(patratP == 4.4);
    }

    @Test
    public void isNotNull(){
        double patratP = patrat.perimetru();
        assertNotNull(patratP);
    }

    @Test
    public void isFalse(){
        double patratP = patrat.perimetru();
        assertFalse(patratP == 12.3);
    }

}
