package roomescape.reservation.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeApiController {

    @GetMapping("/")
    public String home() {
        return "home";
    }

}