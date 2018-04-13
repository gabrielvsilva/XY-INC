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
    private String coordinatedX;

    @Column(name = "COORDINATED_Y", nullable = false)
    private String coordinatedY;

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

    public String getCoordinatedX() {
        return coordinatedX;
    }

    public void setCoordinatedX(String coordinatedX) {
        this.coordinatedX = coordinatedX;
    }

    public String getCoordinatedY() {
        return coordinatedY;
    }

    public void setCoordinatedY(String coordinatedY) {
        this.coordinatedY = coordinatedY;
    }

    /*
    SELECT * FROM zupper.landmark
    where coordinated_x BETWEEN 10 AND 30
    and coordinated_y BETWEEN 0 AND 20;

    -- 20 10 10
     */
}
