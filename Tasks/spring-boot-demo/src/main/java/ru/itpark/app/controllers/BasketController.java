package ru.itpark.app.controllers;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.itpark.app.models.User;
import ru.itpark.app.security.UserDetailsImpl;

@Controller
@RequestMapping("/basket")
public class BasketController {

    @GetMapping
    @PreAuthorize("isAuthenticated()")
    public String getBasketPage(Authentication authentication, ModelMap model) {
        if (authentication != null) {
            UserDetailsImpl userDetails = (UserDetailsImpl)authentication.getPrincipal();
            User user = userDetails.getUser();
            model.addAttribute("user", user);
            return "basket";
        }
       return "redirect:/users";
    }
}
