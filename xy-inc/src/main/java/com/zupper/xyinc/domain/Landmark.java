package com.zupper.xyinc.domain;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by gabriel on 12/04/18.
 */
@Entity
@Table(name = "LANDMARK")
public class Landmark implements Serializable {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name = "ID")
    private Long id;

    @Column(name = "NAME", nullable = false)
    private String name;

    @Column(name = "COORDINATED_X", nullable = false)
    private Long coordinatedX;

    @Column(name = "COORDINATED_Y", nullable = false)
    private Long coordinatedY;

    public Landmark(){}

    public Landmark(String name, Long coordinatedX, Long coordinatedY) {
        this.name = name;
        this.coordinatedX = coordinatedX;
        this.coordinatedY = coordinatedY;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getCoordinatedX() {
        return coordinatedX;
    }

    public void setCoordinatedX(Long coordinatedX) {
        this.coordinatedX = coordinatedX;
    }

    public Long getCoordinatedY() {
        return coordinatedY;
    }

    public void setCoordinatedY(Long coordinatedY) {
        this.coordinatedY = coordinatedY;
    }

}
