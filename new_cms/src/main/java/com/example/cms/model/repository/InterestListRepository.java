package com.example.cms.model.repository;

import com.example.cms.model.entity.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface InterestListRepository extends JpaRepository<Interest_list, Long> {

    @Query(value = "select * from InterestList", nativeQuery = true)
    List<Interest_list> showAllList();
}
