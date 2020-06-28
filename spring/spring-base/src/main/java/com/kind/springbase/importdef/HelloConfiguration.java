package com.kind.springbase.importdef;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author zhoujifeng
 * @date 2020/6/28 8:40 下午
 */
@Configuration
@ComponentScan("com.kind.springbase.importdef")
@Import(HelloImportBEanDefinitionRegistrar.class)
public class HelloConfiguration {
}
