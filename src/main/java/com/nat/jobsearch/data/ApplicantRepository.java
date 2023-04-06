package com.nat.jobsearch.data;

import com.nat.jobsearch.models.Applicant;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ApplicantRepository extends CrudRepository <Applicant, Long>{
}
