package com.nklkarthi.mockito.java8;

import java.util.Optional;

public interface UnemploymentService {

    boolean personIsEntitledToUnemploymentSupport(Person person);

    Optional<JobPosition> searchJob(Person person, String searchString); 

}
