package es.upm.miw.angelmart.junit;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class C12Test {
    
    private C12 myClass;

    @Before
    public void before() {
        myClass = new C12();
    }


    @Test
    public void testC12() {

    }

    @Test
    public void testMA() {
        myClass = new C12();
        assertEquals( "C12.mA()", myClass.mA() );
    }

}
