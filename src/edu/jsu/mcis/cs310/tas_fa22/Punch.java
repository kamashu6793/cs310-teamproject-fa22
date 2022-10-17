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
    
}
