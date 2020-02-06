package com.ektha.jesery.restwebservice.messenger.dao;

import java.util.HashMap;
import java.util.Map;

import com.ektha.jesery.restwebservice.messenger.model.Message;
import com.ektha.jesery.restwebservice.messenger.model.Profile;

public class DatabaseDAO {

	private static Map<Long, Message> message = new HashMap<>();
	private static Map<String, Profile> profile = new HashMap<>();

	public static Map<Long, Message> getMessages() {
		return message;
	}

	public static Map<String, Profile> getProfiles() {

		return profile;

	}
}
