package ru.itpark.app.controllers;

import freemarker.template.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import ru.itpark.app.models.User;
import ru.itpark.app.repositories.UsersRepository;

import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.util.*;

@Controller
public class UsersController {

    @Autowired
    private UsersRepository usersRepository;

    //public boolean users;

    //public ru.itpark.app.controllers.UsersController classInst = new ru.itpark.app.controllers.UsersController();


    @GetMapping("/users")
    public String getUsers(ModelMap model, Authentication authentication) {
        Boolean isAuthorized;
        if (authentication != null) {
            isAuthorized = true;
        } else {
            isAuthorized = false;
        }
        model.addAttribute("isAuthorized", isAuthorized);
        return "users";
    }


    @GetMapping("/users/catalog")
    public String getCatalogPage() {
        return "catalog";
    }

    @GetMapping("/users/search")
    public String getSearchPage() {
        return "users_search";
    }

    @GetMapping("/users/search.json")
    @ResponseBody
    public List<User> getUsersByKeyword(@RequestParam("q") String query) {
        return usersRepository.findAllByFirstNameContainsIgnoreCaseOrLastNameContainsIgnoreCase(query, query);
    }
}
