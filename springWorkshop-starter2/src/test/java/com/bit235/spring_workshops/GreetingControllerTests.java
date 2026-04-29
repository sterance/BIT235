package com.bit235.spring_workshops;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

@SpringBootTest
@AutoConfigureMockMvc
class GreetingControllerTests {

	@Autowired
	private MockMvc mvc;

	@Test
	void getGreetingPage() throws Exception {
		mvc.perform(get("/greeting"))
				.andExpect(status().isOk())
				.andExpect(view().name("greeting"));
	}

	@Test
	void postGreetingForm() throws Exception {
		mvc.perform(post("/greeting")
				.param("id", "7")
				.param("content", "Hello"))
				.andExpect(status().isOk())
				.andExpect(view().name("result"))
				.andExpect(content().string(org.hamcrest.Matchers.containsString("id: 7")))
				.andExpect(content().string(org.hamcrest.Matchers.containsString("content: Hello")));
	}
}
