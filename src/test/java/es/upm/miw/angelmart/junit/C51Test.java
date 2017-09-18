package es.upm.miw.angelmart.junit;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class C51Test {

    private C51 myClass;
    
    @Before
    public void before() {
        myClass = new C51();
    }


    @Test
    public void testC51() {

    }

    @Test
    public void testM1() {
        myClass = new C51();
        assertEquals( "C51.m1()", myClass.m1() );
    }

    @Test
    public void testM2() {
        myClass = new C51();
        assertEquals( "C51.m2()", myClass.m2() );
    }

}
