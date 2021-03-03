package com.example.demoServlets.repository;

import com.example.demoServlets.model.User;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Repository {
    private Map<Integer, User> repository = new ConcurrentHashMap<>();
    private int repIndex = 1;
    private static Repository INSTANCE;

    private Repository() {
    }

    public static Repository getInstance() {
        if (INSTANCE == null) {
            synchronized (Repository.class) {
                if (INSTANCE == null) {
                    INSTANCE = new Repository();
                }
            }
        }
        return INSTANCE;
    }

    public void save(User user) {
        repository.put(repIndex, user);
        repIndex++;
    }

    public String show() {
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<Integer, User> entry : repository.entrySet()) {
            sb.append(entry.getKey() + ": " + entry.getValue().toString() + "\n");
        }
        return sb.toString();
    }
    public void deleteItem(int id){
        repository.remove(id);
    }
}
