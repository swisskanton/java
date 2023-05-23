package profile.profiles.service;

import org.springframework.stereotype.Service;

@Service("home")
public class HomeService {

    public String showMsg() {
        return "Welcome!";
    }
}
