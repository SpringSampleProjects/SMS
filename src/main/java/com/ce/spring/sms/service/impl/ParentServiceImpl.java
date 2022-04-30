package com.ce.spring.sms.service.impl;

import com.ce.spring.sms.domain.entity.ParentEntity;
import com.ce.spring.sms.domain.request.ParentRequestModel;
import com.ce.spring.sms.repository.ParentRepository;
import com.ce.spring.sms.service.ParentService;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service(value = "parentService")
public class ParentServiceImpl implements ParentService {

    @Autowired
    private ParentRepository parentRepository;

    @Override
    public ParentEntity addParent(ParentRequestModel parentRequestModel) {
        ModelMapper modelMapper = new ModelMapper();
        modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
        ParentEntity parentEntity = modelMapper.map(parentRequestModel, ParentEntity.class);

        return parentRepository.save(parentEntity);
    }

    @Override
    public ParentEntity updateParent(ParentEntity parentEntity) {
        return parentRepository.save(parentEntity);
    }

    @Override
    public void deleteParent(Long parentId) {
        parentRepository.deleteById(parentId);
    }

    @Override
    public Optional<ParentEntity> getParent(Long parentId) {
        return parentRepository.findById(parentId);
    }

    @Override
    public List<ParentEntity> getParents() {
        return parentRepository.findAll();
    }
}
