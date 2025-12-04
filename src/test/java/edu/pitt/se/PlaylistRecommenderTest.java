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
    public void testValidTitleIncorrectTooShort() {
        assertEquals(false, PlaylistRecommender.isValidTrackTitle(""));
    }

    @Test
    public void testValidclassifyEnergyLow() {
        assertEquals("LOW", PlaylistRecommender.classifyEnergy({3,4,5,6,7}));
    }

    

}
