package com.deadpk.WebappProject

import com.deadpk.WebappProject.web.WebRestController
import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit4.SpringRunner
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get
import org.springframework.test.web.servlet.result.MockMvcResultMatchers.content

@RunWith(SpringRunner::class)
@WebMvcTest(WebRestController::class)
class WebappProjectApplicationTests {

	@Autowired
	lateinit var mock: MockMvc

	@Test
	fun Hello() {
		mock.perform(get("/hello")).andExpect(content().string("hello"))
	}
}
