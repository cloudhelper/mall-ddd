package org.cloudhelper.admin.application.query.impl;

import javax.annotation.Resource;
import org.cloudhelper.admin.application.query.XxxQueryService;
import org.cloudhelper.admin.application.query.spi.IUserQuery;
import org.cloudhelper.admin.application.query.spi.IXxxRepositoryQuery;

/**
 * @author kaizi2009
 */
public class XxxQueryServiceImpl implements XxxQueryService {

    @Resource
    private IUserQuery userQuery;

    @Resource
    private IXxxRepositoryQuery xxxRepositoryQuery;

    @Override
    public String getById(String id) {
        String userId = "xxx";
        String userName = userQuery.getUserName(userId);
        return null;
    }
}
