package edu.iu.c322.trackingserviceC322project.repository;

import edu.iu.c322.trackingserviceC322project.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TrackingRepository extends JpaRepository<User,Integer> {
}
