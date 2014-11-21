package com.infosky.yjj.model;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;

public class Speaker {
	@Cacheable(value = "wordCache", key = "#word")
	public String sayWord(String word) {
		// 第一次打开 /speaker 会执行 该方法 输出
		// 第二次开始 将直接从缓存 读取 不会执行该方法
		System.out.println("[sayWord] method is invoked!");
		return word;
	}

	@CacheEvict(value = "wordCache", key = "#word")
	public String clearWord(String word) {
		System.out.println("[clearWord] method is invoked!");
		return "Ok";
	}
}
