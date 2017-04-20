package org.nklkarthi.persistence.dao;

import java.util.List;

import org.nklkarthi.persistence.model.User;
import org.nklkarthi.web.util.SearchCriteria;

public interface IUserDAO {
    List<User> searchUser(List<SearchCriteria> params);

    void save(User entity);
}
