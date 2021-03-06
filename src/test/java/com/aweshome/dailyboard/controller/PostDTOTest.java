package com.aweshome.dailyboard.controller;

import org.junit.Assert;
import org.junit.Test;

import com.aweshome.dailyboard.EqualsVerifier;
import com.aweshome.dailyboard.model.Post;
import com.aweshome.dailyboard.controller.PostDTO;

import jersey.repackaged.com.google.common.collect.Lists;


public class PostDTOTest {

	@Test
	public void equalsTest() {
		EqualsVerifier<PostDTO> equalsTester = new EqualsVerifier<PostDTO>();
		
		PostDTO a = new PostDTO("data");
		PostDTO b = new PostDTO("data");
		PostDTO c = new PostDTO("data");
		PostDTO differentContent = new PostDTO("different data");
		PostDTO nullContent = new PostDTO(null);
		Post post = new Post("data");
		
		Assert.assertEquals(a, b);
		Assert.assertNotEquals(a, null);
		Assert.assertNotEquals(a, post);
		Assert.assertNotEquals(a, differentContent);
		Assert.assertNotEquals(a, nullContent);
		
		equalsTester.assertEqualsProperties(a, b, c, Lists.newArrayList(differentContent, nullContent));
	}
	
}
