package org.cloudhelper.mall;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import org.cloudhelper.mall.domain.repository.IXxlRepository;
import org.springframework.context.annotation.Configuration;

/**
 * @author kaizi2009
 */
@Configuration
public class Config {

    @Resource(name = "xxlRepository")
    private IXxlRepository xxlRepository;

    @PostConstruct
    public void t() {
        System.out.println(xxlRepository);
    }
}
