package com.cpe.backend.Examination.repository;

import com.cpe.backend.Examination.entity.Doctor;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


@RepositoryRestResource
public
interface DoctorRepository extends JpaRepository<Doctor, Long> {
    Doctor findById(long id);
}