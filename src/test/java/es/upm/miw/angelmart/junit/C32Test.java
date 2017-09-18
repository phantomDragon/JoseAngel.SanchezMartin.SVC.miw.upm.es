package es.upm.miw.angelmart.junit;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class C32Test {

    private C32 myClass;
    
    @Before
    public void before() {
        myClass = new C32();
    }


    @Test
    public void testC32() {

    }

    @Test
    public void testMA() {
        myClass = new C32();
        assertEquals( "C32.mA()", myClass.mA() );
    }

}
