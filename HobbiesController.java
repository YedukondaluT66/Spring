package com.stratapps.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.stratapps.entity.Hobbies;
import com.stratapps.service.HobbyService;

@RestController
@RequestMapping(path = "/webapitwo")
public class HobbiesController {
	@Autowired
	HobbyService hs;
	
	@GetMapping("/hobby/{personid}")
    public String findByPersonId(@PathVariable int personid){
        return hs.findByPersonId(personid);
    }
    
    @PostMapping("/hobby")   
    public void addHobby(@RequestBody Hobbies he ) {
        hs.addHobby(he);
    }

}
