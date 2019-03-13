package org.acme.jsonb;

import javax.json.bind.Jsonb;
import javax.json.bind.JsonbBuilder;
import javax.json.bind.JsonbConfig;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/binding")
public class Binding {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        Person person = new Person("John", "Doe");

        JsonbConfig config = new JsonbConfig();
        Jsonb jsonb = JsonbBuilder.create(config);
        String json = jsonb.toJson(person);   
        Person person2 = jsonb.fromJson(json, Person.class);

        return json + person;
    }
}