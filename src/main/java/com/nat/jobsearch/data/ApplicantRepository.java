package com.nat.jobsearch.data;

import com.nat.jobsearch.models.Applicant;
import org.springframework.data.repository.CrudRepository;

public interface ApplicantRepository extends CrudRepository <Applicant, Long>{
}
