package io.github.luiz.felipe.magalhaes.quarkussocial.rest;

import io.github.luiz.felipe.magalhaes.quarkussocial.domain.model.User;
import io.github.luiz.felipe.magalhaes.quarkussocial.rest.dto.CreateUserRequest;
import io.quarkus.hibernate.orm.panache.PanacheQuery;

import javax.transaction.Transactional;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/users")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class UserResource {

    @POST
    @Transactional
    public Response createUser(CreateUserRequest userRequest){
        User user = new User();
        user.setName(userRequest.getName());
        user.setAge(userRequest.getAge());

        user.persist();

        return Response.ok(user).build();
    }

    @GET
    public Response listAllUsers() {
        PanacheQuery<User> query = User.findAll();

        return Response.ok(query.list()).build();
    }

}
