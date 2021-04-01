package za.ac.cput.adp;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.*;

class ASchouwTest {

    private String equal1;
    private String equal2;
    private String equal3;
    private String identify1;
    private String identify2;
    private String identify3;
    private ASchouw fail1;
    private ASchouw fail2;
    private ASchouw fail4;
    private String name;
    private ASchouw disable;
    private ASchouw disable1;

    @BeforeEach
    void setUp() {
        equal1 = new String();
        equal2 = equal1;
        equal3 = equal2;
        identify1 = "100";
        identify2 = "200";
        identify3 = identify1;
        fail1 = new ASchouw();
        fail2 = new ASchouw();
        fail4 = fail1;
        disable = disable1;
    }
    @Test
    void testEquality(){
        assertEquals(equal1,equal3);
        assertEquals(equal2,equal1);
    }

    @Test
    void testIdentity(){
        assertSame(identify3,"100");
    }

    @Test
    void testFail(){
        assertEquals(fail4,fail1);
        fail("I made this test fail!");
    }

    @Test
    @Timeout(value = 300, unit = TimeUnit.MILLISECONDS)
    void testTimeout(){
        System.out.println("Is it the same?");
        String expResult ="Anicka Schouw";
        name = "Anicka Schouw";
        String result = name;
        assertEquals(expResult,result);
    }


    @Disabled("Disabled until I say so!")
    @Test
    void testDisable(){
        assertSame(disable,disable1);
        System.out.println("Not supposed to show");
    }
}