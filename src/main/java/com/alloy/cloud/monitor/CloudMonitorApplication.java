
package com.alloy.cloud.monitor;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

/**
 * 监控中心
 */
@EnableAdminServer
@SpringBootApplication
@EnableDiscoveryClient
@ComponentScan("com.alloy.cloud")
public class CloudMonitorApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudMonitorApplication.class, args);
	}

}
