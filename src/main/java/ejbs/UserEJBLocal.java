package ejbs;

import beans.UserBean;

import javax.ejb.Local;
import java.util.List;


@Local
public interface UserEJBLocal {

    UserBean getUser(int id);
    List<UserBean> getAll();
    void addUser(UserBean userBean);

}
