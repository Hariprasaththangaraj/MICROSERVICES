package com.example.crudwithsqlDB.demo.controller;

import com.example.crudwithsqlDB.demo.entity.UserDetailsDao;
import com.example.crudwithsqlDB.demo.entity.UserDetailsDto;
import com.example.crudwithsqlDB.demo.repo.UserDetailsRepo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
@Slf4j
public class SimpleCrudContoller {

    @Autowired
    UserDetailsRepo userDetailsRepo;

//    @RequestMapping(path = "/get", method = RequestMethod.GET)
//    public String getMethod(@RequestBody UserDetailsDto userDetailsDto) {
//
//        UserDetailsDao userDetailsDao = new UserDetailsDao();
//        userDetailsDto.setName(userDetailsDao.getName());
//        userDetailsRepo.findById(userDetailsDto);
//        return "Data Received Successfully!!!";
//    }


    @RequestMapping(path = "/post", method = RequestMethod.POST)
    public String postMethod(@RequestBody UserDetailsDto userDetailsDto) {
        UserDetailsDao userDetailsDao = new UserDetailsDao();
        log.info("Posted Method invocked from Sql Crud !!!!");
        userDetailsDao.setName(userDetailsDto.getName());
        userDetailsRepo.save(userDetailsDao);
        return "Data Received Successfully!!!";
    }

}
