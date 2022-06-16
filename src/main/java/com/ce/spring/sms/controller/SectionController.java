package com.ce.spring.sms.controller;

import com.ce.spring.sms.domain.entity.SectionEntity;
import com.ce.spring.sms.domain.request.SectionRequestModel;
import com.ce.spring.sms.service.SectionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController(value = "sectionController")
@RequestMapping("/section")
public class SectionController {

    @Autowired
    private SectionService sectionService;

    @PostMapping(value="/add")
    public SectionEntity addSection(@RequestBody SectionRequestModel sectionRequestModel){
        return sectionService.addSection(sectionRequestModel);
    }

    @PutMapping(value="/update")
    public SectionEntity updateSection(@RequestBody SectionEntity sectionEntity){
        return sectionService.updateSection(sectionEntity);
    }

    @DeleteMapping(value="/delete/{sectionId}")
    public void deleteSection(@PathVariable Long sectionId){
        sectionService.deleteSection(sectionId);
    }

    @GetMapping(value="/get/{sectionId}")
    public SectionEntity getSection(@PathVariable Long sectionId){
        return sectionService.getSection(sectionId).orElse(null);
    }

    @GetMapping(value={"/","/gets"})
    public List<SectionEntity> getSections(){
        return sectionService.getSections();
    }
}
