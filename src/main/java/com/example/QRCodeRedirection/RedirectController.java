package com.example.QRCodeRedirection;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class RedirectController {

    @GetMapping("/")
    public RedirectView redirect(@RequestHeader(value = "User-Agent", defaultValue = "") String userAgent) {
        if (userAgent.toLowerCase().contains("android")) {
            return new RedirectView(""); // Add link for Android
        } else if (userAgent.toLowerCase().contains("iphone") || userAgent.toLowerCase().contains("ipad")) {
            return new RedirectView(""); // Add link for iOS
        } else {
            return new RedirectView(""); // Add link for other devices
        }
    }
}
