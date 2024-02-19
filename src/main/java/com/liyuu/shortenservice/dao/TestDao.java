package com.liyuu.shortenservice.dao;

import com.liyuu.shortenservice.model.Test;
import org.springframework.data.repository.CrudRepository;

/**
 * @InterfaceName TestDao
 * @Description 测试 jpa 框架
 * @Version 1.0.0
 * @Date 2023/08/28
 * @Author liyuu
 */
public interface TestDao extends CrudRepository<Test, Long> {

}
