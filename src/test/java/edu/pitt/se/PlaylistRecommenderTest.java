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

}
