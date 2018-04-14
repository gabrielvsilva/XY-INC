package com.zupper.xyinc.service.impl;

import com.zupper.xyinc.domain.Landmark;
import com.zupper.xyinc.respository.LandmarkRepository;
import com.zupper.xyinc.service.LandmarkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by gabriel on 13/04/18.
 */
@Service
public class LandmarkServiceImpl implements LandmarkService{

    @Autowired
    private LandmarkRepository landmarkRepository;


    @Override
    public List<Landmark> findAll() {
        return landmarkRepository.findAll();
    }

    @Override
    public void save(Landmark landmark) throws Exception {

        if(landmark == null){
            throw new Exception("MANDATORY_FIELDS_MISSING");
        }

        if(landmark.getName().isEmpty()){
            throw new Exception("MESSAGE_CANNOT_BE_NULL");
        }

        landmarkRepository.save(landmark);
    }


}
