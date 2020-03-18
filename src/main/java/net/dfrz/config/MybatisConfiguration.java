package net.dfrz.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan(basePackages="net.dfrz.**.mapper")
public class MybatisConfiguration {

}
