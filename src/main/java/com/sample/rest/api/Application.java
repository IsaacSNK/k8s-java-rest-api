package com.sample.rest.api;

import com.sample.rest.api.resources.CustomersResource;
import com.sample.rest.api.resources.HealthCheckResource;

import javax.ws.rs.ApplicationPath;
import java.util.HashSet;
import java.util.Set;

@ApplicationPath("/api")
public class Application extends javax.ws.rs.core.Application  {
    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> resources = new HashSet<Class<?>>();
        resources.add(HealthCheckResource.class);
        resources.add(CustomersResource.class);
        return resources;
    }
}
