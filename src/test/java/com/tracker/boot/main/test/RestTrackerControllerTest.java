package com.tracker.boot.main.test;
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.tracker.rest.controller.CustomerRestController;
import com.tracker.rest.controller.RestTrackerController;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RestTrackerControllerTest {

    @Autowired
    private RestTrackerController userController;
    
    @Autowired
    private CustomerRestController customerController;

    @Test
    public void contexLoads() throws Exception {
        assertThat(userController).isNotNull();
    }
    
    @Test
    public void contexLoadsCustomerRestController() throws Exception {
        assertThat(customerController).isNotNull();
        
    }
}

