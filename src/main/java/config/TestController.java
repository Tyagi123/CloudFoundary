package config;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

  @GetMapping("/test")
  public String get(){
      return "Hello World";
  }

    @GetMapping("/api/v1")
    public String getPerm(String name){
        return "Hello "+name;
    }
}
