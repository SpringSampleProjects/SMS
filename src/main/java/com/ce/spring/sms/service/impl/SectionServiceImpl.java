package com.ce.spring.sms.service.impl;

import com.ce.spring.sms.domain.entity.SectionEntity;
import com.ce.spring.sms.domain.request.SectionRequestModel;
import com.ce.spring.sms.repository.SectionRepository;
import com.ce.spring.sms.service.SectionService;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service(value = "sectionService")
public class SectionServiceImpl implements SectionService {

    @Autowired
    private SectionRepository sectionRepository;

    @Override
    public SectionEntity addSection(SectionRequestModel sectionRequestModel) {
        ModelMapper modelMapper = new ModelMapper();
        modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
        SectionEntity sectionEntity = modelMapper.map(sectionRequestModel, SectionEntity.class);

        return sectionRepository.save(sectionEntity);
    }

    @Override
    public SectionEntity updateSection(SectionEntity sectionEntity) {
        return sectionRepository.save(sectionEntity);
    }

    @Override
    public void deleteSection(Long sectionId) {
        sectionRepository.deleteById(sectionId);
    }

    @Override
    public Optional<SectionEntity> getSection(Long sectionId) {
        return sectionRepository.findById(sectionId);
    }

    @Override
    public List<SectionEntity> getSections() {
        return sectionRepository.findAll();
    }
}
