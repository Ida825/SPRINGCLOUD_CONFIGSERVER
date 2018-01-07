package cn.et;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
/**
 * @EnableConfigServer代表启用了分布式配置中心，读取远程git仓库获取配置
 *	所有Spring配置中心的配置文件 都有以下几种格式组成
 *	1.配置文件属于哪个应用
 *  2.配置文件属于哪个阶段profile（开发、测试、产品阶段）
 *  3.在git仓库中哪个分支下（label） 
 * 
 * 
 * @author Administrator
 *
 */
@SpringBootApplication
@EnableConfigServer
public class Main {
	public static void main(String[] args) {
		SpringApplication.run(Main.class, args);

	}

}
