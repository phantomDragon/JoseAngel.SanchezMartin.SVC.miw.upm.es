package es.upm.miw.angelmart.junit;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class C52Test {

    private C52 myClass;
    
    @Before
    public void before() {
        myClass = new C52();
    }


    @Test
    public void testC52() {

    }

    @Test
    public void testMA() {
        myClass = new C52();
        assertEquals( "C52.mA()", myClass.mA() );
    }

}
