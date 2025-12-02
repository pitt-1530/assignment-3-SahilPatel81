package edu.pitt.se;

import java.util.List;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class PlaylistRecommender {

    public static String classifyEnergy(List<Integer> bpms) {
        // TODO: Implement classifyEnergy()
        double avg;

        double total_sum = sum(int_list)  
        double count = len(int_list)  
        double average = total_sum / count  

        if(bpms >= 140){
            return "HIGH";
        }else if(bpms >= 100 && bpms <= 139){
            return "MEDIUM";
        }else if(bpms < 100){
            return "LOW";
        }else if (bpms = null || bpms = bpms.isEmpty()){
            return "REJECTED";
        }
        //throw new UnsupportedOperationException("Not implemented");
    }

    public static boolean isValidTrackTitle(String title) {
        // TODO: Implement isValidTrackTitle()
        if(title = null){
            return false;
        }

        if(title.length() > 30 || title.length() < 1){
            return false;
        }

       Pattern p = Pattern.compile("^[A-Za-z ]+$");
       Matcher m = p.matcher(title);

       if (!m.matches()) {
           return false
       }
       return true; 
        
        //throw new UnsupportedOperationException("Not implemented");
    public static int normalizeVolume(int volumeDb) {
        // TODO: Implement normalizeVolume()
        if(volumeDb > 100){
            volumeDb = 100;
        }
        
        if(volumeDb < 0){
            volumeDb = 0;
        }

        return columeDB;

        //throw new UnsupportedOperationException("Not implemented");
    }
}
