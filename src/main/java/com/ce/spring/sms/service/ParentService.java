package com.ce.spring.sms.service;

import com.ce.spring.sms.domain.entity.ParentEntity;
import com.ce.spring.sms.domain.request.ParentRequestModel;

import java.util.List;
import java.util.Optional;

public interface ParentService {

    ParentEntity addParent(ParentRequestModel parentRequestModel);
    ParentEntity updateParent(ParentEntity parentEntity);
    void deleteParent(Long parentId);
    Optional<ParentEntity> getParent(Long parentId);
    List<ParentEntity> getParents();
}
