package com.visanka.bschatz.model;

import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import static com.visanka.bschatz.activity.StartActivity.USERS_TABLE;

@Entity(tableName = USERS_TABLE)
public class UserModel {

    @NonNull
    @PrimaryKey
    public int user_id = 0;

    public String name = "";
    public String phone_number = "";
    public String reg_date = "";
    public String last_seen = "";
    public String profile_photo = "";
}
