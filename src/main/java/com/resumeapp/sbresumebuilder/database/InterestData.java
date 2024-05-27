package com.resumeapp.sbresumebuilder.database;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.resumeapp.sbresumebuilder.form.InterestDetails;

@Repository
public interface InterestData extends JpaRepository<InterestDetails, Integer> {

}
