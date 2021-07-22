package com.tms;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;


@WebAppConfiguration
@SpringBootTest
class TechiesMindSetApplicationTests {

	@Test
	void contextLoads() {
	}
	
	@Autowired
	private WebApplicationContext webApplicationContext;
	
	
	private MockMvc mockMVC;
	
	@BeforeEach
	private void setup() throws Exception{
		this.mockMVC = MockMvcBuilders.webAppContextSetup(this.webApplicationContext).build();
	}
	
	
	@Test
	public void createUserTest() throws Exception {
		
		String payload = "	{\n"
				+ "		\n"
				+ "		\"userName\":\"tms@user.com\",\n"
				+ "		\"firstName\":\"test\",\n"
				+ "		\"lastName\":\"test\",\n"
				+ "		\"password\":\"password\",\n"
				+ "		\"roles\":[{\n"
				+ "			\n"
				+ "			\"name\":\"ROLE_ADMIN\",\n"
				+ "			\"description\":\"admin\"\n"
				+ "		}]\n"
				+ "	}";
		
		mockMVC.perform(post("/user").contentType(MediaType.APPLICATION_JSON).content(payload))
		.andExpect(status().isOk())
		.andReturn();
		
	}
	
	@Test
	public void fetchUserTest() throws Exception {
		mockMVC.perform(get("/user/{id}",1L)).andExpect(status().isOk()).andReturn();
	}

}
