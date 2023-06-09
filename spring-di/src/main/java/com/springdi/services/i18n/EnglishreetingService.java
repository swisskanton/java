package com.springdi.services.i18n;

import com.springdi.services.GreetingService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"EN", "default"})
@Service("i18nService")
public class EnglishreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Your welcome on my English Page!";
    }
}
