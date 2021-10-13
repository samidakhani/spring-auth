package org.security.auth.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/home")
    public String getHomeScreen() {
        return "<h3> Hello User</h3>";
    }
}
