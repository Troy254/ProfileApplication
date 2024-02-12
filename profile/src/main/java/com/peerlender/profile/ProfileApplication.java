package com.peerlender.profile;

import com.peerlender.profile.domain.model.AppUsers;
import com.peerlender.profile.domain.repository.UsersRepository;
import java.time.LocalDate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProfileApplication implements CommandLineRunner {
  @Autowired
	private UsersRepository usersRepository;

	public static void main(String[] args){SpringApplication.run(ProfileApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		usersRepository.save(new AppUsers("John","John","Sane",
				32,"software engineer", LocalDate.now()));
	}
}
