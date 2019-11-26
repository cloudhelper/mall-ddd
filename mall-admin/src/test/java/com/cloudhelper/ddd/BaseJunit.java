package com.cloudhelper.ddd;

import org.cloudhelper.admin.Boot;
import org.junit.runner.RunWith;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author kaizi2009
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = Boot.class)
@AutoConfigureMockMvc
public class BaseJunit {

}
