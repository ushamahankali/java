package com.ektha.jesery.restwebservice.messenger.service;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Map;

import com.ektha.jesery.restwebservice.messenger.dao.DatabaseDAO;
import com.ektha.jesery.restwebservice.messenger.model.Message;

public class MessageService {

	private Map<Long, Message> messages = DatabaseDAO.getMessages();

	public MessageService() {

		messages.put(1L, new Message(1, "hello world", "usha"));
		messages.put(2L, new Message(2, "hello world", "usha"));
		messages.put(3L, new Message(3, "hello world", "usha"));
		messages.put(4L, new Message(4, "hello world", "usha"));
	}

	public Message addMessage(Message message) {
		message.setId(messages.size() + 1);
		messages.put(message.getId(), message);
		return message;
	}

	public List<Message> getAllMessageforYear(int year) {
		List<Message> messageForYear = new ArrayList<>();
		Calendar cal = Calendar.getInstance();
		for (Message message : messages.values()) {
			cal.setTime(message.getCreated());
			if (cal.get(Calendar.YEAR) == year) {
				messageForYear.add(message);
			}
		}
		return messageForYear;
	}

	public List<Message> getAllMessageforYear(int start, int size) {
		ArrayList<Message> list = new ArrayList<Message>(messages.values());
		if (start + size > list.size())
			return new ArrayList<Message>();
		return list.subList(start, start + size);
	}

	public List<Message> getAllMessages() {
		return new ArrayList<Message>(messages.values());
	}

	public Message getMessage(long id) {
		return messages.get(id);
	}

	public Message removeMessage(long id) {
		return messages.remove(id);
	}

	public Message updateMessage(Message message) {
		if (message.getId() <= 0) {
			return null;
		}
		messages.put(message.getId(), message);
		return message;
	}
}
