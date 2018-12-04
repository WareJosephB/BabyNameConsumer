package syn.ana.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import syn.ana.persistence.domain.BabyName;
import syn.ana.persistence.domain.QueueRequest;
import syn.ana.persistence.domain.QueueRequest.requestType;
import syn.ana.persistence.repository.BabyNameRepository;

@Service
public class RequestService {

	@Autowired
	private BabyNameRepository repo;

	public void parse(QueueRequest request) {
		if (request.getType() == requestType.SAVE) {
			save(request);
		} else if (request.getType() == requestType.DELETE) {
			delete(request);
		} else if (request.getType() == requestType.UPDATE) {
			update(request);
		}
	}

	private void update(QueueRequest request) {
		repo.findById(request.getNameID()).get().setName(request.getName());

	}

	private void delete(QueueRequest request) {
		repo.deleteById(request.getNameID());

	}

	private void save(QueueRequest request) {
		repo.save(new BabyName(request.getName()));

	}

}
