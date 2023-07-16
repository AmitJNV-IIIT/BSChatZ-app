package com.visanka.bschatz.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.sql.Connection;
        import java.sql.DriverManager;
        import java.sql.PreparedStatement;
        import java.sql.SQLException;

class PostDao {
    private static final String DB_URL = "https://amit-bschat.000webhostapp.com/";
    private static final String DB_USER = "username";
    private static final String DB_PASSWORD = "password";

    public void createAndSavePost(int userId, String content) {
        try (Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
             PreparedStatement stmt = conn.prepareStatement("INSERT INTO posts (user_id, content) VALUES (?, ?)")) {
            stmt.setInt(1, userId);
            stmt.setString(2, content);
            stmt.executeUpdate();
            System.out.println("Post created and saved successfully!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
