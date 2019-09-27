package com.gradel.todo.service;


import com.gradle.todo.model.TodoItem;

import java.util.HashMap;
import java.util.Map;

public class TodoRepository {

    private static Map<String,TodoItem> items = new HashMap<String,TodoItem>();

}