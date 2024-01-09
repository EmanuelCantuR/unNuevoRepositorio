package com.example.ejemploIndat2.repository;

import com.example.ejemploIndat2.entity.UserEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserReporsitory extends CrudRepository<UserEntity, Long>{

}
