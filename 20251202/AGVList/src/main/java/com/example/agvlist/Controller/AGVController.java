package com.example.agvlist.Controller;

import cn.hutool.core.io.IoUtil;
import com.example.agvlist.pojo.AGV;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/***
 *@title AGVController
 *@description <TODO description class purpose>
 *@author Chuck
 *@version 1.0.0
 *@create 2025/11/25 21:43
 *@mail beier33@163.com
 **/

// @Controller
// @ResponseBody
@RestController
public class AGVController {
    @RequestMapping("/list")
    public List<AGV> list(){
        //1.加载并读取文件获取AGV
        InputStream in = this.getClass().getClassLoader().getResourceAsStream("AGV.txt");
        // ArrayList<String> lines = IoUtil.readLines(in, StandardCharsets.UTF_8,new ArrayList<>());
        ArrayList<String> lines = IoUtil.readUtf8Lines(in, new ArrayList<>());

        //2.将AGV转换成对象
        List<AGV> agvList =  lines.stream().map(line -> {
            String[] split = line.split(",");
            return new AGV (
                    Integer.parseInt(split[0]),
                    split[1],
                    split[2],
                    split[3],
                    Integer.parseInt(split[4]),
                    Integer.parseInt(split[5]),
                    LocalDateTime.parse(split[6], DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"))
            );
        }).toList();

        //3.返回结果
        return agvList;
    }

    @RequestMapping("/hello")
    public String hello(String name){
        System.out.println("Hello Controller ... hello ： " + name);
        return "Hello " + name + "~";
    }
}
