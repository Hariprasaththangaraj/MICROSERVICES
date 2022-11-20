package com.example.crudwithsqlDB.demo.repo;

import com.example.crudwithsqlDB.demo.entity.UserDetailsDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDetailsRepo extends JpaRepository<UserDetailsDao, Integer> {
}
