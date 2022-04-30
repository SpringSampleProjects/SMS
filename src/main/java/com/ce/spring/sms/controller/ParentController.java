package com.ce.spring.sms.controller;

import com.ce.spring.sms.domain.entity.ParentEntity;
import com.ce.spring.sms.domain.request.ParentRequestModel;
import com.ce.spring.sms.service.ParentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController(value = "parentController")
@RequestMapping("/parent")
public class ParentController {

    @Autowired
    private ParentService parentService;

    @PostMapping(value = "/add")
    public ParentEntity addParent(@RequestBody ParentRequestModel parentRequestModel){
        return parentService.addParent(parentRequestModel);
    }

    @PutMapping(value="/update")
    public ParentEntity updateParent(@RequestBody ParentEntity parentEntity){
        return parentService.updateParent(parentEntity);
    }

    @DeleteMapping(value = "/delete/{parentId}")
    public void deleteParent(@PathVariable Long parentId){
        parentService.deleteParent(parentId);
    }

    @GetMapping(value = "/get/{parentId}")
    public ParentEntity getParent(@PathVariable Long parentId){
        return parentService.getParent(parentId).orElse(null);
    }

    @GetMapping(value = {"/","/gets"})
    public List<ParentEntity> getParents(){
        return parentService.getParents();
    }
}
