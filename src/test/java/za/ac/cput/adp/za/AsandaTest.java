package za.ac.cput.adp.za;

import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import java.util.concurrent.TimeUnit;

class AsandaTest {

    private Asanda asanda1;
    private Asanda asanda2;
    private Asanda asanda3;

    @BeforeEach
    void setUp() {
        asanda1 = new Asanda();
        asanda2 = new Asanda();
        asanda3 = new Asanda();
    }
    @Test
    void testEquality(){
        assertEquals(asanda1,asanda3);

    }

    @Test
    void testIdentity(){
        assertSame(asanda3,asanda2);
    }

    @Test
    void failed(){
        fail("Failed on purpose");
        while(true)
            System.out.println("if executed");


    }

    @Test
    @Disabled
    void disable(){
        System.out.println("12");
    }

    @Test
    @Timeout(value=200, unit = TimeUnit.MICROSECONDS)
    void timeOut() throws InterruptedException{
        Thread.sleep(400);
        System.out.println("Time up");
    }

}