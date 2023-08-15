package pers.legendary.business.user.service.impl;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.stereotype.Component;
import pers.legendary.common.api.business.user.service.IRoleService;

/**
 * Description:
 *
 * @author YangYang
 * @version 1.0.0
 * @date 2022/3/20 9:57
 */
@Slf4j
@Component
@RequiredArgsConstructor
@DubboService(version = "0.0.1")
public class RoleServiceImpl implements IRoleService {

}
