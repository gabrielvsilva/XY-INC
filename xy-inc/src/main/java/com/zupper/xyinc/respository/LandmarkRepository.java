package com.zupper.xyinc.respository;

import com.zupper.xyinc.domain.Landmark;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * Created by gabriel on 13/04/18.
 */
public interface LandmarkRepository extends JpaRepository<Landmark, Long> {
}
