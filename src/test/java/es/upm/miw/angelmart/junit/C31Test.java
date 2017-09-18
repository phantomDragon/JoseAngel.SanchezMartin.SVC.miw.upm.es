package es.upm.miw.angelmart.junit;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class C31Test {

    private C31 myClass;
    
    @Before
    public void before() {
        myClass = new C31();
    }


    @Test
    public void testC31() {

    }

    @Test
    public void testM1() {
        myClass = new C31();
        assertEquals( "C31.m1()", myClass.m1() );
    }

    @Test
    public void testM2() {
        myClass = new C31();
        assertEquals( "C31.m2()", myClass.m2() );
    }

}
