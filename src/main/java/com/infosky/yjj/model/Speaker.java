package com.infosky.yjj.model;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;

public class Speaker {
	@Cacheable(value = "wordCache", key = "#word")
	public String sayWord(String word) {
		return word;
	}

	@CacheEvict(value = "wordCache", key = "#word")
	public String clearWord(String word) {
		return "Ok";
	}
}
