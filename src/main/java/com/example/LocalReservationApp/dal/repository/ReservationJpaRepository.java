package com.example.LocalReservationApp.dal.repository;

import com.example.LocalReservationApp.dal.entity.ReservationEntity;
import com.example.LocalReservationApp.dal.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

public interface ReservationJpaRepository extends JpaRepository<ReservationEntity, Long> {

    @Query(value = "select * from reservation where user_id = :userId", nativeQuery = true)
    List<ReservationEntity> findAllReservationsForUser(Long userId);

    @Modifying
    @Transactional
    @Query(value = "UPDATE reservation SET is_confirmed = true WHERE id = :id", nativeQuery = true)
    void confirmReservation(Long id);
}
