package com.peerlender.profile.domain.event;

import com.google.gson.Gson;
import com.peerlender.profile.domain.model.AppUsers;
import com.peerlender.profile.domain.repository.UsersRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserRegisteredEventHandler {

  private Logger LOGGER = LoggerFactory.getLogger(UserRegisteredEventHandler.class);

  private static final Gson GSON = new Gson();
  private UsersRepository usersRepository;

  @Autowired
  public UserRegisteredEventHandler(UsersRepository usersRepository){
    this.usersRepository = usersRepository;
  }

  public void handleUserRegistration(String userDetails){
    AppUsers appUsers = GSON.fromJson(userDetails, AppUsers.class);
    LOGGER.info("user {} registered", appUsers.getUsername());
    usersRepository.save(appUsers);
  }
}
