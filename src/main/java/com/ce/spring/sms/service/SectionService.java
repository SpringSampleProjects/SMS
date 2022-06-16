package com.ce.spring.sms.service;

import com.ce.spring.sms.domain.entity.SectionEntity;
import com.ce.spring.sms.domain.request.SectionRequestModel;

import java.util.List;
import java.util.Optional;

public interface SectionService {
    SectionEntity addSection(SectionRequestModel sectionRequestModel);
    SectionEntity updateSection(SectionEntity sectionEntity);
    void deleteSection(Long sectionId);
    Optional<SectionEntity> getSection(Long sectionId);
    List<SectionEntity> getSections();
}
