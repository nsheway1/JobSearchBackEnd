package com.nat.jobsearch.data;

import com.nat.jobsearch.models.Job;
import org.springframework.data.repository.CrudRepository;

public interface JobRepository extends CrudRepository <Job, Long> {
}
