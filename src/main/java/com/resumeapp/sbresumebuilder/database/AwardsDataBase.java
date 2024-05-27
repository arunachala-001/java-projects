package com.resumeapp.sbresumebuilder.database;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.resumeapp.sbresumebuilder.form.AwardsDetails;

@Repository
public interface AwardsDataBase extends JpaRepository <AwardsDetails, Integer> {

}
