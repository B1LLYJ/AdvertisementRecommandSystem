package com.xitu.ad.service.impl;

import com.xitu.ad.dao.CreativeRepository;
import com.xitu.ad.entity.Creative;
import com.xitu.ad.service.ICreativeService;
import com.xitu.ad.vo.CreativeRequest;
import com.xitu.ad.vo.CreativeResponse;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by billy
 */
public class CreativeServiceImpl implements ICreativeService {

    private final CreativeRepository creativeRepository;

    @Autowired
    public CreativeServiceImpl(CreativeRepository creativeRepository) {
        this.creativeRepository = creativeRepository;
    }

    @Override
    public CreativeResponse createCreative(CreativeRequest request) {

        Creative creative = creativeRepository.save(
                request.convertToEntity()
        );

        return new CreativeResponse(creative.getId(), creative.getName());
    }
}
