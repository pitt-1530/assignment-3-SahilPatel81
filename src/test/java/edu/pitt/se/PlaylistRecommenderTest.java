package edu.pitt.se;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PlaylistRecommenderTest {

    @Test
    public void placeholder() {
        assertTrue(true);
    }

    @Test
    public void testNormalize() {
        assertEquals(100, PlaylistRecommender.normalizeVolume(150));
    }

    @Test
    public void testNormalizeTwo() {
        assertEquals(0, PlaylistRecommender.normalizeVolume(-150));
    }

     @Test
    public void testValidTitleCorrect() {
        assertEquals(true, PlaylistRecommender.isValidTrackTitle("SupermanandSpiderman"));
    }

     @Test
    public void testValidTitleIncorrect() {
        assertEquals(false, PlaylistRecommender.isValidTrackTitle("SupermanandSpiderman%"));
    }

      @Test
    public void testValidTitleIncorrectTooLong() {
        assertEquals(false, PlaylistRecommender.isValidTrackTitle("SupermanandSpidermanugsgfgdrtghhhhhhhhhhh"));
    }

    @Test
    public void testValidTitleIncorrectExact30() {
        assertEquals(true, PlaylistRecommender.isValidTrackTitle("123451234512345123451234512345"));
    }

     @Test
    public void testValidTitleIncorrectTooShort() {
        assertEquals(false, PlaylistRecommender.isValidTrackTitle(""));
    }

    @Test
    public void testLowEnergy() {
        assertEquals("LOW", PlaylistRecommender.classifyEnergy(java.util.Arrays.asList(6, 7, 8)));
    }

    @Test
    public void testMediumEnergy() {
        assertEquals("MEDIUM", PlaylistRecommender.classifyEnergy(java.util.Arrays.asList(145, 130, 120)));
    }

    @Test
    public void testHighEnergy() {
        assertEquals("HIGH", PlaylistRecommender.classifyEnergy(java.util.Arrays.asList(180, 200, 220)));
    }

    @Test
    public void testHighEdgeEnergy() {
        assertEquals("HIGH", PlaylistRecommender.classifyEnergy(java.util.Arrays.asList(140, 140, 140)));
    }
    

}
