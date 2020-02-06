package com.ektha.jesery.restwebservice.messenger.resources;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import com.ektha.jesery.restwebservice.messenger.model.Message;
import com.ektha.jesery.restwebservice.messenger.service.MessageService;

@Path("/messages")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class MessageResource {

	MessageService service = new MessageService();

	@POST
	public Message addMessage(Message message) {
		return service.addMessage(message);

	}

	@GET
	public List<Message> getMessage(@QueryParam("year") int year, @QueryParam("start") int start,
			@QueryParam("size") int size) {
		if (year > 0)

		{
			return service.getAllMessageforYear(year);
		}
		if (start >= 0 && size >= 0) {
			return service.getAllMessageforYear(start, size);
		}
		return service.getAllMessages();

	}

	@DELETE
	@Path("/{messageId}")
	public void removeMessage(@PathParam("messageId") long messageId) {
		service.removeMessage(messageId);
	}

	@GET
	@Path("/{messageId}")
	public Message test(@PathParam("messageId") long messageId) {
		return service.getMessage(messageId);
	}

	@PUT
	@Path("/{messageId}")
	public Message updateMessage(@PathParam("messageId") long messageId, Message message) {
		message.setId(messageId);
		return service.updateMessage(message);
	}
}
