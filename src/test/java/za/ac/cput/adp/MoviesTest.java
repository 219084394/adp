package za.ac.cput.adp;

/*
 *author: keenan Solomons 219264228
 */

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Disabled;

import static org.junit.jupiter.api.Assertions.*;

class MoviesTest {

    private Movies movie1;
    private Movies movie2;
    private Movies movie3;

    @BeforeEach
    void setUp() {
        movie1 = new Movies();
        movie2 = new Movies();
        movie3 = movie1;
    }

    //Object Identity
    @Test
    void testMovieId() {
        assertSame(movie1, movie3);
    }

    //Object Equality
    @Test
    void testMovieEquality() {
        assertEquals(movie1, movie3);
    }

    //Failing Test
    @Test
    void failTest() {
        fail("This test failed");
    }

    //Timeout
    @Timeout(100)
    @Test
    void timeouts() {
        assertEquals(movie1, movie3);
    }

    //Disable Test
    @Disabled
    @Test
    void disablingTest() {
        assertEquals(movie1.getType(), movie2.getType());
        System.out.println("Keenan disabled this");
    }
}