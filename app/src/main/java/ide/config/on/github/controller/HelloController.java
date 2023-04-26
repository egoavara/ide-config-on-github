package ide.config.on.github.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
  @Value("${idetest.whoami}")
  private String whoami;

  @GetMapping("/")
  public String index() {
    return String.format("Hello world, i am %s", whoami);
  }
}
