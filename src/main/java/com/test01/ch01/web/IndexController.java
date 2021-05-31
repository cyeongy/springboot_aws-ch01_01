package com.test01.ch01.web;

import com.test01.ch01.service.posts.PostsService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@RequiredArgsConstructor
@Controller
public class IndexController {

    private final PostsService postsService;

    @GetMapping("/")
    public String index (Model model){
        model.addAttribute("posts", postsService.findAllDesc());
        return "index";
    }


//    @GetMapping("/")
//    public String index(){
//        return "index";
//    }

    @GetMapping("/posts/save")
    public String postsSave() {
        return "posts-save";
    }
}
