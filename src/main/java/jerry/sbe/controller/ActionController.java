package jerry.sbe.controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jerry.sbe.ResponseData;

@RestController
@EnableAutoConfiguration  
public class ActionController extends ExceptionController {
	@RequestMapping("/") 
	public ResponseData home() {  
        return new ResponseData("Hello World!");  
    }
	
	@RequestMapping("/user/{user}")
	public ResponseData user(@PathVariable("user") String user) {
		ResponseData responseData = new ResponseData(user);
//		return "hello,"+user;
		return responseData;
	}
}
