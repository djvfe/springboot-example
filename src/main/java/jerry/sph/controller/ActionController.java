package jerry.sph.controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration  
public class ActionController {
	@RequestMapping("/")  
    String home() {  
        return "Hello World!";  
    }
	
	@RequestMapping("/{path}")
	public String index(@PathVariable("path") String path) {
		return path;
	}
}
