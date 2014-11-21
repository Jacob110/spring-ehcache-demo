package com.infosky.yjj.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.infosky.yjj.model.Speaker;

@Controller
public class HelloController {
	@Autowired
	Speaker speaker;

	@RequestMapping("/speaker")
	public ModelAndView speakerWorld(
			@RequestParam(required = true) String message) {
		message = speaker.sayWord(message);
		System.out.println(message);
		return new ModelAndView("speaker", "message", message);
	}

	@RequestMapping("/speakerclear")
	public ModelAndView speakerWorldClear(
			@RequestParam(required = true) String message) {
		message = speaker.clearWord(message);
		System.out.println(message);
		return new ModelAndView("speaker", "message", message);
	}
}
