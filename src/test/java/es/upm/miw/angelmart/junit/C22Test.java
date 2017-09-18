package es.upm.miw.angelmart.junit;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class C22Test {

private C22 myClass;
    
    @Before
    public void before() {
        myClass = new C22();
    }


    @Test
    public void testC22() {

    }

    @Test
    public void testMA() {
        myClass = new C22();
        assertEquals( "C22.mA()", myClass.mA() );
    }

}
