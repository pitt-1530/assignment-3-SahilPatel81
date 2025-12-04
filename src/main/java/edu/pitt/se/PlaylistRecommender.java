package edu.pitt.se;

import java.util.*;
import java.util.List;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class PlaylistRecommender {

    public static String classifyEnergy(List<Integer> bpms) {
        if (bpms == null || bpms.isEmpty()) {
            return "REJECTED";
        }

        double sum = 0;
        for (int bpm : bpms) {
            sum += bpm;
        }

        double average = sum / bpms.size();

        if (average >= 140) {
            return "HIGH";
        } else if (average >= 100) {
            return "MEDIUM";
        } else {
            return "LOW";
        }
    }

    public static boolean isValidTrackTitle(String title) {
        if (title == null) {
            return false;
        }

        if (title.length() < 1 || title.length() > 30) {
            return false;
        }

        Pattern p = Pattern.compile("^[A-Za-z ]+$");
        Matcher m = p.matcher(title);

        return m.matches();
    }

    public static int normalizeVolume(int volumeDb) {
        if (volumeDb > 100) {
            return 100;
        }
        if (volumeDb < 0) {
            return 0;
        }
        return volumeDb;
    }
}
