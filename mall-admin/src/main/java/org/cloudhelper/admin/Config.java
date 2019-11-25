package org.cloudhelper.admin;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import org.cloudhelper.admin.domain.repository.IXxlAdminRepository;
import org.springframework.context.annotation.Configuration;

/**
 * @author kaizi2009
 */
@Configuration
public class Config {

    @Resource(name = "xxlRepository")
    private IXxlAdminRepository xxlRepository;

    @PostConstruct
    public void t() {
        System.out.println(xxlRepository);
    }
}
