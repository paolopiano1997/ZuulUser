package zuul.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/appliance")
@RestController
public class UserController {

	@Autowired
	private ResourceFeignService service;
	

	@RequestMapping("/predict")
	public String predict() {
		return service.predict();
	}
	
	
}
