package org.nklkarthi.persistence.multiple.dao.user;

import org.nklkarthi.persistence.multiple.model.user.Possession;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PossessionRepository extends JpaRepository<Possession, Long> {

}
