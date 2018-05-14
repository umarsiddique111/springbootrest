package com.examplespringboot.springboot;





import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
@RunWith(SpringRunner.class)
public class PersonRestControllerTest {
    @Autowired
    private PersonRestController personRestController;
    @Test
    public void controllerInitializedCorrectly() {
        assertThat(personRestController).isNotNull();
    }
    
}