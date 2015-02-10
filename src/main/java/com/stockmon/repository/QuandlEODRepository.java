package com.stockmon.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.stockmon.model.QuandlEOD;

@Repository("QuandlEODRepository")
public interface QuandlEODRepository extends JpaRepository<QuandlEOD, Long> {
/*
	@Query("Select new com.pluralsight.model.GoalReport(g.minutes, e.minutes, e.activity) " +
			"from Goal g, Exercise e where g.id = e.goal.id")
	List<QuandlEOD> findAllEODReports();
*/
}
