package edu.jsu.mcis.cs310.tas_fa22;

 import java.time.LocalDateTime;
 import java.sql.*;
 import java.time.DayOfWeek;
 import java.time.LocalDate;
 import java.time.LocalTime;
 import java.time.format.DateTimeFormatter;
 import java.util.HashMap;
 import static java.time.temporal.ChronoUnit.MINUTES;

public class Punch {
    
    private int terminalid, id, eventtypeid;
    private PunchAdjustmentType punchtypeid;
    private String badgeid, adjustmenttype;
    private LocalDateTime timestamp, adjustedtimestamp;
    private Badge badge;
    private LocalTime adjustedtime;

    public Punch(int terminalid, int id, int eventtypeid, PunchAdjustmentType punchtypeid, String badgeid, String adjustmenttype, LocalDateTime timestamp, LocalDateTime adjustedtimestamp, Badge badge, LocalTime adjustedtime) {
        this.terminalid = terminalid;
        this.id = id;
        this.eventtypeid = eventtypeid;
        this.punchtypeid = punchtypeid;
        this.badgeid = badgeid;
        this.adjustmenttype = adjustmenttype;
        this.timestamp = timestamp;
        this.adjustedtimestamp = adjustedtimestamp;
        this.badge = badge;
        this.adjustedtime = adjustedtime;
    }

    public int getTerminalid() {
        return terminalid;
    }

    public int getId() {
        return id;
    }

    public int getEventtypeid() {
        return eventtypeid;
    }

    public PunchAdjustmentType getPunchtypeid() {
        return punchtypeid;
    }

    public String getBadgeid() {
        return badgeid;
    }

    public String getAdjustmenttype() {
        return adjustmenttype;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public LocalDateTime getAdjustedtimestamp() {
        return adjustedtimestamp;
    }

    public Badge getBadge() {
        return badge;
    }

    public LocalTime getAdjustedtime() {
        return adjustedtime;
    }
    
    
    
}
