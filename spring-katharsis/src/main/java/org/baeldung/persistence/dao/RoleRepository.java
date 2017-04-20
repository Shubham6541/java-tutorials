package org.nklkarthi.persistence.dao;

import org.nklkarthi.persistence.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {

}
