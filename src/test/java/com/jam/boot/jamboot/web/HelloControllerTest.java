package com.jam.boot.jamboot.web;

import com.jam.boot.jamboot.config.AppProperties;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class HelloControllerTest {

    private MockMvc mockMvc;

    @Resource
    private AppProperties appProperties;

    @Value("${sys.modal}")
    private String sysModal;


    @Before
    public void setUp(){
        mockMvc = MockMvcBuilders.standaloneSetup(new HelloController()).build();
    }


    @Test
    public void testConf(){
        System.out.println("jaflsjdflkjsd");
        System.out.println(sysModal);
        Assert.assertEquals(sysModal,"debug");
    }


    @Test
    public void testAppConf(){

        Assert.assertEquals(appProperties.getA(),"a");
    }

    @Test
    public void testHello() throws Exception{
        mockMvc.perform(MockMvcRequestBuilders.get("/main/hello")
                .accept(MediaType.APPLICATION_JSON_UTF8))
                .andDo(MockMvcResultHandlers.print());

    }


    @Test
    public void testAddUser() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.post("/main/user")
                .param("userName","")
                .param("pwd","123")
                .param("age","100")
                .accept(MediaType.APPLICATION_JSON_UTF8))
                .andDo(MockMvcResultHandlers.print());

    }
}
