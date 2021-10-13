package org.security.auth.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String getHomeScreen() {
        return "<h3> Welcome!!</h3>";
    }

    @GetMapping("/user")
    public String getUserScreen() {
        return "<h3> Welcome User!!</h3>";
    }

    @GetMapping("/admin")
    public String getAdminScreen() {
        return "<h3> Welcome Admin!!</h3>";
    }
}
