package com.zupper.xyinc.controller;

import com.zupper.xyinc.domain.Landmark;
import com.zupper.xyinc.service.LandmarkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by gabriel on 13/04/18.
 */

@Controller
@RequestMapping( "/api/landmark/" )
public class LandmarkController {

    @Autowired( required = false )
    private LandmarkService landmarkService;


    @RequestMapping( value = "/list", method = RequestMethod.GET )
    public @ResponseBody
    ResponseEntity<List<Landmark>> getAllLandmarks( ) {

        try {
            List< Landmark > landmarkReturn = landmarkService.findAll();
            return new ResponseEntity< List< Landmark > >( landmarkReturn, HttpStatus.OK );
        } catch ( Exception e ) {
            List< Landmark > landmarkReturn = new ArrayList<>();
            return new ResponseEntity<List< Landmark >>( landmarkReturn, HttpStatus.NOT_FOUND );
        }

    }


    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public
    @ResponseBody
    Object saveOrUpdateLandmark(@RequestBody Landmark landmark) {

        try {
            landmarkService.save( landmark );

            URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(landmark.getId()).toUri();

            return ResponseEntity.created(uri).build();
        }
        catch (Exception ex) {
            Map e = new HashMap<>();
            e.put("message", ex.getMessage());
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e);
        }

    }

    @RequestMapping(value ="/listProximity", method = RequestMethod.GET)
    @ResponseBody
    List<Landmark> listProximity(@RequestParam("x") int x, @RequestParam("y") int y, @RequestParam("distanceMax") int distanceMax){

        List<Landmark> listLandmark = landmarkService.findAll();

        List<Landmark> proximitys = new ArrayList<Landmark>();
        for(Landmark ld : listLandmark){
            if(distanceMax >= ( Math.sqrt( ((ld.getCoordinatedX() - x)*(ld.getCoordinatedX() - x)) + ((ld.getCoordinatedY() - y)*(ld.getCoordinatedY() - y) ) ) )){
                proximitys.add(ld);
            }
        }
        return proximitys;
    }

}
