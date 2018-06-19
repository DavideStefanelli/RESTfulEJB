package ejbs;

import beans.UserBean;

import javax.annotation.PostConstruct;
import javax.ejb.Singleton;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.ArrayList;
import java.util.List;

@Singleton
@Path("user")
public class UserEJB implements UserEJBLocal {

    private static List<UserBean> userBeans;

    static  {
        userBeans = new ArrayList<UserBean>();
        userBeans.add(0 , new UserBean(0, "davide.stefanelli@live.it", "password"));
        userBeans.add(1, new UserBean(1, "stefanelli.davide@gmail.com", "password"));
    }

    @Path("getall")
    @Produces(MediaType.APPLICATION_JSON)
    @GET
    public List<UserBean> getAll(){
        return userBeans;
    }

    @Path("view/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    @GET
    public UserBean getUser(@PathParam("id") int id) {
        return userBeans.get(id);
    }

    @Path("add")
    @Consumes(MediaType.APPLICATION_JSON)
    @POST
    public void addUser(UserBean userBean) {
        userBeans.add(userBean);
    }


}
