package es.upm.miw.spai.ecp2;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import es.upm.miw.spai.ecp2.Fraction;

public class FractionTest {

private Fraction fraccion1;
	
	@Before
    public void before() {
		fraccion1 = new Fraction(1, 2);
    }
    
	@Test
    public void testFraccionDecimal() {
        assertEquals(0.5, fraccion1.decimal(),10-2);
    }
    
    @Test
    public void testFracciongetNumerador() {
        assertEquals(1, fraccion1.getNumerator());
    }
    
    @Test
    public void testFracciongetNDenominador() {
        assertEquals(2, fraccion1.getDenominator());
    }

}
