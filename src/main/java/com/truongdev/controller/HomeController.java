package com.truongdev.controller;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.ObjectUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.truongdev.model.Category;
import com.truongdev.model.UserDtls;
import com.truongdev.service.CategoryService;
import com.truongdev.service.UserService;

import jakarta.servlet.http.HttpSession;

@Controller
public class HomeController {
 
	@Autowired
	private UserService userService;
	
	@Autowired
	private CategoryService categoryService;
	
	@GetMapping("/")
	public String index() {
		return "index";
	}
	
	@GetMapping("/login")
	public String login() {
		return "login";
	}
	
	@GetMapping("/register")
	public String register() {
		return "register";
	}
	
	@PostMapping("/saveCategory")
	public String saveCategory(@ModelAttribute Category category) {
		
		return null;
	}
	
	@PostMapping("/saveUser")
	public String saveUser(@ModelAttribute UserDtls user, HttpSession session) throws IOException {
	    
	   
	    // Lưu người dùng vào cơ sở dữ liệu
	    UserDtls saveUser = userService.saveUser(user);

	    // Kiểm tra xem người dùng đã được lưu thành công chưa
	    if (!ObjectUtils.isEmpty(saveUser)) {
	        session.setAttribute("succMsg", "Register successfully");
	    } else {
	        session.setAttribute("errorMsg", "Something went wrong on the server");
	    }
	    
	    return "redirect:/register";
	}

}
