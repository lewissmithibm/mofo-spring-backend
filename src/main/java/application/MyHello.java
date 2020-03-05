package application;

import org.springframework.web.bind.annotation.RestController;

import com.google.gson.JsonObject;

import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class MyHello {

	@RequestMapping("/hello")
	public String index() {
        JsonObject json = new JsonObject();
        json.addProperty("message", "Greetings from Spring");
        return json.toString();
	}

}