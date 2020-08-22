package com.codeup.saveroom.controllers;

import com.codeup.saveroom.models.Post;
import com.codeup.saveroom.models.User;
import com.codeup.saveroom.repositories.PostRepo;
import com.codeup.saveroom.repositories.UserRepo;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class PostController {

    private PostRepo postDao;
    private UserRepo userDao;

    public PostController(PostRepo postDao, UserRepo userDao) {
        this.postDao = postDao;
        this.userDao = userDao;
    }

    @GetMapping("/posts")
    public String posts(Model model) {
        model.addAttribute("posts", postDao.findAll());
        return  "posts/index";
    }

    @GetMapping("/posts/{id}")
    public String getPost(@PathVariable long id, Model model) {
        model.addAttribute("post",postDao.getOne(id));
        return  "posts/show";
    }

    @GetMapping("/posts/create")
    public String getCreatePostForm(){
        return "posts/create";
    }

    @PostMapping("/posts/create")
    public String createPost(@RequestParam String title, @RequestParam String body){
        Post newPost = new Post();
        newPost.setTitle(title);
        newPost.setBody(body);
        User loggedIn = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        newPost.setUser(loggedIn);
        postDao.save(newPost);
        return "redirect:/posts";
    }

}
