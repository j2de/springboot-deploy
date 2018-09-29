package com.koda.webservice.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.koda.webservice.domain.posts.PostsRepository;
import com.koda.webservice.dto.PostsSaveRequestDto;
import com.koda.webservice.service.PostsService;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
public class WebRestController {
	
	private PostsService postsService;
	
	@GetMapping("/hello")
	public String hello() {
		return "HelloWorld";
	}
	
	@PostMapping("/posts")
	public Long savePosts(@RequestBody PostsSaveRequestDto dto) {
		return postsService.save(dto);
	}
}
