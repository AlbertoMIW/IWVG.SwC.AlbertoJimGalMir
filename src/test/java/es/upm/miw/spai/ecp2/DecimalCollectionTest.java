package es.upm.miw.spai.ecp2;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import es.upm.miw.spai.ecp2.DecimalCollection;

public class DecimalCollectionTest {
    private DecimalCollection dc;
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();

    @Before
    public void before() {
        this.dc = new DecimalCollection();
        this.dc.add(2.0);
        this.dc.add(-1.0);
        this.dc.add(3.0);
        this.dc.add(2.0);
    }
    
    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));
    }

    @After
    public void cleanUpStreams() {
        System.setOut(null);
        System.setErr(null);
    }
    
    @Test
    public void testDecimalCollection() {
        this.dc = new DecimalCollection();
        assertEquals(0, this.dc.size());
    }

    @Test
    public void testAdd() {
        assertEquals(4, this.dc.size());
    }

    @Test
    public void testSum() {
        assertEquals(6, this.dc.sum(), 10e-5);
    }

    @Test
    public void testHigher() {
        assertEquals(3, this.dc.higher(), 10e-5);
    }

    @Test
    public void testGetFirstElementSuccess() {
    	assertEquals(2, this.dc.getFirstElement(), 10e-5);
    }
    
    @Test
    public void testGetFirstElementFail() {
    	DecimalCollection dc1 = new DecimalCollection();
    	assertEquals(Double.NEGATIVE_INFINITY, dc1.getFirstElement(), 10e-5);
    	assertEquals("ERROR: No elements in collection.", errContent.toString().trim());
    }
}
