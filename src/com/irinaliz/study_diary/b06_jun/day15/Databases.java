package com.irinaliz.study_diary.b06_jun.day15;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Databases {
    public static String tablename = "";
    public static String col1 = "";
    public static String col2 = "";
    public static String col3 = "";

    private static Connection conn;
    public static Connection getDatabase(){
        try {
            if (conn == null || (conn != null && conn.isClosed())) {
                Class.forName("com.mysql.cj.jdbc.Driver");
                String url = "jdbc:mysql://localhost/testdb";
                conn = DriverManager.getConnection(url, "root", "1231dasc");
            }
        } catch (ClassNotFoundException e) {
            System.out.println("드라이버 로딩 오류");
        } catch (SQLException e) {
            System.out.println("SQL문볍 오류");
            e.printStackTrace();
        }
        return conn;
    }

    public static void value_create() throws SQLException {

        Connection conn = getDatabase();
        PreparedStatement pstmt = conn.prepareStatement("INSERT INTO"+ tablename +"(" + col1 +","+  col2 +","+ col3 +") VALUES (?, ?, ?, ?)" ); //   + " ON DUPLICATE KEY UPDATE value = ?;");
        pstmt.setString(1,"dawda");

    }
}
