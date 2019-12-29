package sid.org.docker_yassine;

import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DockerYassineApplication {

	public static void main(String[] args) {
		SpringApplication.run(DockerYassineApplication.class, args);
	}
	@GetMapping("/test")
	public Map<String,Object>test(){
		Map<String,Object> data = new HashMap<>();
		data.put("name","from Docker");
		data.put("yassine irisi",2020);
		return data;
	}

}
