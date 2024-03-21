package com.NAGPProject.NAGPKubernetesProject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.NAGPProject.NAGPKubernetesProject.entity.User;


public interface UserRepository extends JpaRepository<User, Long>{

}
