package edu.jsu.mcis.cs310.tas_fa22.dao;

import edu.jsu.mcis.cs310.tas_fa22.*;
import java.sql.*;
import java.util.*;

/**
 *
 * @author Colbylee Mincey
 */
public class ShiftDAO {
    private static final String QUERY_ID = "SELECT * FROM shift WHERE id = ?";
    private static final String QUERY_BADGE = "SELECT * FROM employee WHERE badgeid = ?";
    private HashMap<String, String>map = new HashMap<>();
    private final DAOFactory daofactory;
    
    ShiftDAO (DAOFactory daofactory) {
        this.daofactory = daofactory;
    }
    
    public Shift find(int id) {
        Shift shift = null;
        PreparedStatement PS = null;
        ResultSet RS = null;
        
        try{
            Connection conn = daofactory.getConnection();
            
            if(conn.isValid(0)){
            PS = conn.prepareStatement(QUERY_ID);
            PS.setInt(1, id);
            
            boolean hasresults = PS.execute();
            
                if (hasresults) {
                   RS = PS.getResultSet();
                   
                   
                while (RS.next()) {
                    map.put("id", RS.getString("id"));
                    map.put("description", RS.getString("description"));
                    map.put("shiftstart", RS.getString("shiftstart"));
                    map.put("shiftstop", RS.getString("shiftstop"));
                    map.put("roundinterval", RS.getString("roundinterval"));
                    map.put("graceperiod", RS.getString("graceperiod"));
                    map.put("dockpenalty", RS.getString("dockpenalty"));
                    map.put("lunchstart", RS.getString("lunchstart"));
                    map.put("lunchstop", RS.getString("lunchstop"));
                    map.put("lunchthreshold", RS.getString("lunchthreshold"));
                    shift = new Shift(map); // shift class using HashMap constructor
                    }
                }
            }
        }catch (SQLException e) {
    throw new DAOException(e.getMessage());
} finally {
    if (RS != null) {
        try {
            RS.close();
        } catch (SQLException e) {
            throw new DAOException(e.getMessage());
        }
    }
    if (PS != null) {
        try {
            PS.close();
        } catch (SQLException e) {
            throw new DAOException(e.getMessage());
        }
    }
}
return shift;
}
    public Shift find(Badge badge){
        Shift shift = null;
        PreparedStatement PS = null;
        ResultSet RS = null;
        
        try{
            Connection conn = daofactory.getConnection();
            
            if(conn.isValid(0)){
                PS = conn.prepareStatement(QUERY_BADGE);
                PS.setString(1, badge.getId());
                
                boolean hasresults = PS.execute();
                
                if(hasresults){
                    RS = PS.getResultSet();
                    
                    while (RS.next()){
                        map.put("id", RS.getString("id"));
                        map.put("description", RS.getString("description"));
                        map.put("shiftstart", RS.getString("shiftstart"));
                        map.put("shiftstop", RS.getString("shiftstop"));
                        map.put("roundinterval", RS.getString("roundinterval"));
                        map.put("graceperiod", RS.getString("graceperiod"));
                        map.put("dockpenalty", RS.getString("dockpenalty"));
                        map.put("lunchstart", RS.getString("lunchstart"));
                        map.put("lunchstop", RS.getString("lunchstop"));
                        map.put("lunchthreshold", RS.getString("lunchthreshold")); 
                        shift = new Shift(map); // shift class using HashMap constructor
                    }
                    
                } 
            }
        } catch (SQLException e) {
            throw new DAOException(e.getMessage());
        } finally {
            if (RS != null) {
                try {
                    RS.close();
                } catch (SQLException e) {
                    throw new DAOException(e.getMessage());
                }
            }
        }
        if (PS != null) {
            try {
                PS.close();
            } catch (SQLException e) {
                throw new DAOException(e.getMessage());
            }
        }return shift;
    }
} 
