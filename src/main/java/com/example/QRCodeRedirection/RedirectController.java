package com.example.QRCodeRedirection;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class RedirectController {

    @GetMapping("/")
    public RedirectView redirect(@RequestHeader(value = "User-Agent", defaultValue = "") String userAgent) {
        String destination;

        if (userAgent.toLowerCase().contains("android")) {
            destination = ""; // add for Android
        } else if (userAgent.toLowerCase().contains("iphone") || userAgent.toLowerCase().contains("ipad")) {
            destination = ""; // add for iOS
        } else {
            destination = ""; // add the URL of the website you want to redirect to
        }

        return new RedirectView(destination);
    }

}
