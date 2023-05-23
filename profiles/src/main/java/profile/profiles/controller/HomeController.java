package profile.profiles.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import profile.profiles.service.HomeService;

@RestController
public class HomeController {

    private HomeService homeService;
    @Value("Message: ${msg}")
    private String msg;

    @Autowired
    public void setHomeService(HomeService homeService) {
        this.homeService = homeService;
    }

    @RequestMapping("/")
    public String index() {
        return this.msg;
    }
}
