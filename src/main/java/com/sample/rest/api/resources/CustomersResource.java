package com.sample.rest.api.resources;

import com.sample.rest.api.model.Customer;
import com.sample.rest.api.model.DataStore;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import java.util.Map;

@Path("/customers")
public class CustomersResource {
    @GET
    @Produces("application/json")
    public Response getCustomerList() {
        Map<Integer, Customer> customers = DataStore.getInstance().getCustomerDB();
        if (customers == null) {
            return Response.serverError().build();
        }
        return Response.ok(customers.values()).build();
    }
}
