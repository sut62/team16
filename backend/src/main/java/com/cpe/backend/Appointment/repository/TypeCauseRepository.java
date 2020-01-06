package com.cpe.backend.Appointment.repository;

import com.cpe.backend.Appointment.entity.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface TypeCauseRepository extends JpaRepository<TypeCause, Long> {
    TypeCause findById(long id);
}
