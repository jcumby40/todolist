package com.example.todolist

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = 'Todo')
public class Todo{
    @PrimaryKey(autoGenerate = true)
    private int id;
    @columnInfo(name = "")
}