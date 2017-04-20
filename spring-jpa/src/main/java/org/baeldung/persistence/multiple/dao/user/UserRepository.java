package org.nklkarthi.persistence.multiple.dao.user;

import org.nklkarthi.persistence.multiple.model.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {

}
