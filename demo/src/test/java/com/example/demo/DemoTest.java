package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * 自创建的一个测试类
 *
 * @author ：Axel
 * @date ：2020/5/15 10:48
 */
@SpringBootTest(classes = {DemoApplication.class})
public class DemoTest {

    @Test
    public void Test1(){
        System.out.println("ddd");
    }

}
