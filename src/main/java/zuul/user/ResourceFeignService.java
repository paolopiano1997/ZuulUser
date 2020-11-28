package zuul.user;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name = "detection")
public interface ResourceFeignService {
	
	@RequestMapping("/appliance/predict")
	String predict();
	
}
