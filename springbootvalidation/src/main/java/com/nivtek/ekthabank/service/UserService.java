package com.nivtek.ekthabank.service;

import com.nivtek.ekthabank.entity.User;

public interface UserService {

	public boolean isUserAlredayPresent(User user);

	public void saveUser(User user);

}
