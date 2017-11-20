package ohtu.controller;

import org.junit.Before;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;

import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.context.WebApplicationContext;


 @SpringBootTest
 @AutoConfigureMockMvc
 @RunWith(SpringJUnit4ClassRunner.class)
 @WebAppConfiguration
 
 public class VinkkiControllerTest {
    
 @Autowired
 private MockMvc mockMvc;


    @Test
    public void shouldReturnIndex() throws Exception {
        this.mockMvc.perform(get("/")).andDo(print()).andExpect(status().isOk());
    }
    
     
    @Test
	public void uriTemplate() throws Exception {
            this.mockMvc.perform(post("/").param("kayttajanimi", "Jaana")
            .param("salasana", "salasana"))
                .andExpect(redirectedUrl("/vinkki"));
	     
        }
    
  
}



    


