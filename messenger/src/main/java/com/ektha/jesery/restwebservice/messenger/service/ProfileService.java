package com.ektha.jesery.restwebservice.messenger.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.ektha.jesery.restwebservice.messenger.dao.DatabaseDAO;
import com.ektha.jesery.restwebservice.messenger.model.Profile;

public class ProfileService {

	private Map<String, Profile> profiles = DatabaseDAO.getProfiles();

	public ProfileService() {
		profiles.put("usha1", new Profile(1L, "usha1", "abc", "cdf"));
		profiles.put("usha2", new Profile(2L, "usha2", "abc", "cdf"));
		profiles.put("usha3", new Profile(3L, "usha3", "abc", "cdf"));
		profiles.put("usha4", new Profile(4L, "usha4", "abc", "cdf"));
		profiles.put("usha5", new Profile(5L, "usha5", "abc", "cdf"));
	}

	public Profile addProfile(Profile profile) {
		profile.setId(profiles.size() + 1);
		profiles.put(profile.getProfileName(), profile);
		return profile;
	}

	public List<Profile> getAllProfiles() {
		return new ArrayList<Profile>(profiles.values());
	}

	public Profile getProfile(String profileName) {

		return profiles.get(profileName);

	}

	public Profile removeProfile(String profileName) {
		return profiles.remove(profileName);
	}

	public Profile updateProfile(Profile profile) {
		if (profile.getProfileName().isEmpty()) {
			return null;
		}
		profiles.put(profile.getProfileName(), profile);
		return profile;
	}
}
