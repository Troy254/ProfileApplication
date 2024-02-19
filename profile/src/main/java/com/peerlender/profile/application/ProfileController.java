package com.peerlender.profile.application;

import com.peerlender.profile.domain.model.AppUsers;
import com.peerlender.profile.domain.repository.UsersRepository;
import java.time.LocalDate;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/profile")
public class ProfileController {

  private UsersRepository usersRepository;

  @Autowired
  public ProfileController(UsersRepository usersRepository) {
    this.usersRepository = usersRepository;
  }

  @GetMapping("/users")
  public List<AppUsers> findAllUsers() {
    return usersRepository.findAll();
  }

  @PostMapping("/user")
  public void newUser(@RequestBody AppUsers appUsers) {
    appUsers.setRegisteredSince(String.valueOf(LocalDate.now()));
    usersRepository.save(appUsers);
  }

  @PutMapping("/user")
  public void updateUser(@RequestBody AppUsers appUsers) {
    appUsers.setRegisteredSince(String.valueOf(LocalDate.now()));
    usersRepository.save(appUsers);
  }
}
