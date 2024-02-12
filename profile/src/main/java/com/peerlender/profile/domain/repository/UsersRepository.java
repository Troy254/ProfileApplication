package com.peerlender.profile.domain.repository;

import com.peerlender.profile.domain.model.AppUsers;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersRepository extends JpaRepository<AppUsers,String> {

}
