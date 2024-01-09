package com.example.ejemploIndat2.service;

import com.example.ejemploIndat2.entity.UserEntity;
import com.example.ejemploIndat2.repository.UserReporsitory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    UserReporsitory userRepository;
//    public UserService(UserReporsitory userReporsitory){
//        this.userReporsitory = userReporsitory;
//    }

    public List<UserEntity> findAll(){
        return (List<UserEntity>) userRepository.findAll();
    }

    public String created(UserEntity user){
        userRepository.save(user);
        return "user created";
    }

    public Optional<UserEntity> findById(Long id){
        return userRepository.findById(id);
    }

    public String deleteById(Long id){
        userRepository.deleteById(id);
        return "deleted";
    }

    public String actualizar(Long id, UserEntity userAct){
        Optional<UserEntity> user1 = userRepository.findById(id);
        user1.orElseThrow().setName(userAct.getName());
        user1.orElseThrow().setAge(userAct.getAge());
        return "Actualizado";
    }

}
