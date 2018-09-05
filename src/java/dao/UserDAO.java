package dao;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Profile;

public class UserDAO {
    public static Connection openConnection(){
        Connection conn = null;
        try {
            Class.forName(DBConfig.driver);
            conn = DriverManager.getConnection(DBConfig.url, DBConfig.user, DBConfig.password);
            System.out.print(DBConfig.driver);
        } catch (Exception ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return conn;
    }
    
    public static boolean isDuplicateEmailOrPhone (String emailOrPhone) {
        try (Connection conn = openConnection()){
            String select = "SELECT id FROM tbl_profile WHERE email_mobile = ?";
            PreparedStatement pstmt = conn.prepareStatement(select);
            pstmt.setString(1, emailOrPhone);
            return pstmt.executeQuery().next();
        } catch (Exception ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    public static Profile getProfile(String emailOrPhone, String password){
        Profile profile = null;
        try (Connection conn = openConnection()){
            String select = "SELECT * FROM tbl_profile WHERE email_mobile = ? and password = ?";
            PreparedStatement pstmt = conn.prepareStatement(select);
            pstmt.setString(1, emailOrPhone);
            pstmt.setString(2, password);
            
            ResultSet rs = pstmt.executeQuery();
            if(rs.next()){
                profile = new Profile(rs.getString("first_name"), 
                        rs.getString("last_name"), 
                        rs.getString("email_mobile"), 
                        rs.getString("password"), 
                        rs.getString("birthday"), 
                        rs.getString("sex"));
            }
        } catch (Exception ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return profile;
    }
    
    public static Profile checkLogin(String emailOrPhone, String password){
        return getProfile(emailOrPhone, password);
    }
    
    public static boolean addNewUser(Profile profile){
        try (Connection conn = openConnection()){
            String insert = "INSERT INTO tbl_profile VALUES(null, ?, ?, ?, ?, ?, ?, null)";
            PreparedStatement pstmt = conn.prepareStatement(insert);
            pstmt.setString(1, profile.getFirstName());
            pstmt.setString(2, profile.getLastName());
            pstmt.setString(3, profile.getEmailOrPhone());
            pstmt.setString(4, profile.getPassword());
            pstmt.setString(5, profile.getBirthday());
            pstmt.setString(6, profile.getSex());
            
            pstmt.executeUpdate();
            pstmt.close();
            
            return true;
        } catch (Exception ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    public static boolean updateProfile(Profile profile, String emailOrPhone){
        try (Connection conn = openConnection()){
            String update = "UPDATE tbl_profile SET first_name = ?, last_name = ?, email_mobile = ?, "
                    + "password = ?, birthday = ?, sex = ? WHERE email_mobile = ?";
            PreparedStatement pstmt = conn.prepareStatement(update);
            pstmt.setString(1, profile.getFirstName());
            pstmt.setString(2, profile.getLastName());
            pstmt.setString(3, profile.getEmailOrPhone());
            pstmt.setString(4, profile.getPassword());
            pstmt.setString(5, profile.getBirthday());
            pstmt.setString(6, profile.getSex());
            pstmt.setString(7, emailOrPhone);
            
            pstmt.executeUpdate();
            
            return true;
        } catch (Exception ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return false;
    }
    
    public static byte[] getImageData(String emailOrPhone){
        String select = "SELECT avatar FROM tbl_profile WHERE email_mobile = ?";
        try (Connection conn = openConnection()){
            PreparedStatement pstmt = conn.prepareStatement(select);
            pstmt.setString(1, emailOrPhone);
            ResultSet rs = pstmt.executeQuery();
            if(rs.next()){
                return rs.getBytes("avatar");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    
    public static boolean updateUserAvatar(InputStream inputStream, String emailOrPhone) {
        String update = "UPDATE tbl_profile SET avatar = ? WHERE email_mobile = ?";
        try(Connection conn = openConnection()){
            PreparedStatement pstmt = conn.prepareStatement(update);
            pstmt.setBlob(1, inputStream);
            pstmt.setString(2, emailOrPhone);
            pstmt.executeUpdate();
            return true;
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return false;
    }
}

