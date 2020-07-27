package com.sample.rest.api.model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DataStore {
    private static DataStore instance = null;

    private Map<Integer, Customer> customerDB = new HashMap<>();

    private DataStore() {
        this.initialData();
    }

    private void initialData() {
        customerDB.put(1, new Customer(1, "John Doe", "Somewhere, USA"));
        customerDB.put(2, new Customer(2, "Jerry Seinfeld", "New York, USA"));
        customerDB.put(3, new Customer(3, "Scott Summers", "Another Place, USA"));
    }

    public static synchronized DataStore getInstance() {
        if (instance == null) {
            instance = new DataStore();
        }
        return instance;
    }

    public Map<Integer, Customer> getCustomerDB() {
        return this.customerDB;
    }
}
