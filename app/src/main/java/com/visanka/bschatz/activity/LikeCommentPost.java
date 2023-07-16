package com.visanka.bschatz.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

class LikeCommentDao {
    private static final String DB_URL = "https://amit-bschat.000webhostapp.com/";
    private static final String DB_USER = "username";
    private static final String DB_PASSWORD = "password";

    public void likePost(int postId, int userId) {
        try (Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
             PreparedStatement stmt = conn.prepareStatement("INSERT INTO likes (post_id, user_id) VALUES (?, ?)")) {
            stmt.setInt(1, postId);
            stmt.setInt(2, userId);
            stmt.executeUpdate();
            System.out.println("Post liked successfully!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void commentOnPost(int postId, int userId, String content) {
        try (Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
             PreparedStatement stmt = conn.prepareStatement("INSERT INTO comments (post_id, user_id, content) VALUES (?, ?, ?)")) {
            stmt.setInt(1, postId);
            stmt.setInt(2, userId);
            stmt.setString(3, content);
            stmt.executeUpdate();
            System.out.println("Comment added successfully!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
