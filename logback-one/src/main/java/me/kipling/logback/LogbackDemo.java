package me.kipling.logback;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/*
 * 
 * logback配置优先级顺序
 *logback首先在classpath寻找logback.groovy文件，
 *如果没找到，继续寻找logback-test.xml文件
 *如果没找到，继续寻找logback.xml文件
 *如果仍然没找到，则使用默认配置（打印到控制台）
 *最佳实践
 *
 *slf4j 定义日志接口及基本实现，而具体的实现由其他日志组件提供
 *
 *log4j
 *commons-logging
 *logback
 *因此，如果想替换成其他的日志组件，只需要替换jar包即可。
 * 
 * 
 * 
 */
public class LogbackDemo {

	private static Logger log = LoggerFactory.getLogger(LogbackDemo.class);

	public static void main(String[] args) {
		log.trace("======trace");
		log.debug("======debug");
		log.info("======info");
		log.warn("======warn");
		log.error("======error");
	}
}
