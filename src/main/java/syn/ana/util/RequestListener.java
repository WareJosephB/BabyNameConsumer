package syn.ana.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import syn.ana.persistence.domain.QueueRequest;
import syn.ana.service.RequestService;

@Component
public class RequestListener {

	@Autowired
	private RequestService service;

	@JmsListener(destination = "${queue.name}", containerFactory = "myFactory")
	public void receiveMessage(QueueRequest request) {
		service.parse(request);
	}

}