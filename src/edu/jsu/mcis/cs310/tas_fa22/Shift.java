package edu.jsu.mcis.cs310.tas_fa22;

/**
 *
 * @author Adam Parton
 */

import java.time.*;
import java.util.HashMap;

public class Shift {
    
    private String description;
    private int id, roundInterval, gracePeriod, dockPenalty, lunchThreshold, 
                lunchDuration, shiftDuration;
    private LocalTime shiftStart, shiftStop, lunchStart, lunchStop;
    
    
    public Shift(HashMap<String, String > parameters ) {
        this.id = Integer.parseInt(parameters.get("id"));
        this.description = parameters.get("description");
        this.shiftStart = LocalTime.parse(parameters.get("shiftstart"));
        this.shiftStop = LocalTime.parse(parameters.get("shiftstop"));
        this.roundInterval = Integer.parseInt(parameters.get("roundinterval"));
        this.gracePeriod = Integer.parseInt(parameters.get("graceperiod"));
        this.dockPenalty = Integer.parseInt(parameters.get("dockpenalty"));
        this.lunchStart = LocalTime.parse(parameters.get("lunchstart"));
        this.lunchStop = LocalTime.parse(parameters.get("lunchstop"));
        this.lunchThreshold = Integer.parseInt(parameters.get("lunchthreshold"));    
        this.lunchDuration = (int)Duration.between(this.lunchStart, this.lunchStop).toMinutes();
        this.shiftDuration = (int)Duration.between(this.shiftStart, this.shiftStop).toMinutes();
         
    }

    public String getDescription() {
        return description;
    }

    public int getId() {
        return id;
    }

    public int getRoundInterval() {
        return roundInterval;
    }

    public int getGracePeriod() {
        return gracePeriod;
    }

    public int getDockPenalty() {
        return dockPenalty;
    }

    public int getLunchThreshold() {
        return lunchThreshold;
    }

    public int getLunchDuration() {
        return lunchDuration;
    }

    public LocalTime getShiftStart() {
        return shiftStart;
    }

    public LocalTime getShiftStop() {
        return shiftStop;
    }

    public LocalTime getLunchStart() {
        return lunchStart;
    }

    public LocalTime getLunchStop() {
        return lunchStop;
    }

    public int getShiftDuration() {
        return shiftDuration;
    }

    
        @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
         
        sb.append(description).append(": ").append(shiftStart).append(" - ");
        sb.append(shiftStop).append(" (").append(shiftDuration).append(" minutes)").append("; Lunch: ");
        sb.append(lunchStart).append(" - ").append(lunchStop).append(" (").append(lunchDuration).append(" minutes)");

        return sb.toString();
    }

}