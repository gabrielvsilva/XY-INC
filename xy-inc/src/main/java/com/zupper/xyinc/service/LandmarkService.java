package com.zupper.xyinc.service;

import com.zupper.xyinc.domain.Landmark;

import java.util.List;

/**
 * Created by gabriel on 13/04/18.
 */
public interface LandmarkService {

    List<Landmark> findAll();

    void save(Landmark landmark) throws Exception;
}
