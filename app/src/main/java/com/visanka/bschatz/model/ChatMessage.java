package com.visanka.bschatz.model;

import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import static com.visanka.bschatz.activity.StartActivity.MESSAGES_TABLE;

@Entity(tableName = MESSAGES_TABLE)
public class ChatMessage {

    @NonNull
    @PrimaryKey
    public int message_id = 0;

    public String sender = "";
    public String receiver = "";
    public String receive_time = "";
    public String chat_thread = "";
    public String message_type = "";
    public String last_update = "";
    public String user_id = "";
    public String name = "";
    public String phone_number = "";
    public String reg_date = "";
    public String last_seen = "";
    public String profile_photo = "";
    public boolean seen = false;
    public String sent_time = "";
    public String body = "";
    public String media_links = "";
    public boolean fromMe = false;

}
