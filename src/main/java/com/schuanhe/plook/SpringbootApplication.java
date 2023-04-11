package com.schuanhe.plook;

import com.schuanhe.plook.utils.CurPool;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.support.ManagedList;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.List;

@SpringBootApplication
@MapperScan(basePackages = {"com.schuanhe.plook.mapper"})
public class SpringbootApplication {

    public static void main(String[] args) {

        ConfigurableApplicationContext run = SpringApplication.run(SpringbootApplication.class, args);

        List<String> names = new ManagedList<>();

        CurPool.roomList.put("系统默认房间(幻鹤)",names);

    }

}
