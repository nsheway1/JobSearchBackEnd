package com.nat.jobsearch.data;

import com.nat.jobsearch.models.Employer;
import org.springframework.data.repository.CrudRepository;

public interface EmployerRepository extends CrudRepository <Employer, Long> {
}
