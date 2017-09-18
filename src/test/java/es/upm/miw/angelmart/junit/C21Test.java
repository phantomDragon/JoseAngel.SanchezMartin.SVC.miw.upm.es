package es.upm.miw.angelmart.junit;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class C21Test {
    
    private C21 myClass;
    
    @Before
    public void before() {
        myClass = new C21();
    }


    @Test
    public void testC21() {

    }

    @Test
    public void testM1() {
        myClass = new C21();
        assertEquals( "C21.m1()", myClass.m1() );
    }

    @Test
    public void testM2() {
        myClass = new C21();
        assertEquals( "C21.m2()", myClass.m2() );
    }

}
