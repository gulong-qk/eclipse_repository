package com.freemaker;

import freemarker.cache.FileTemplateLoader;
import freemarker.template.Configuration;
import freemarker.template.Template;
import org.junit.Test;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * @author gl
 * @time 2020-05-06 23:30
 * @function :第一个freemaker程序
 * @step :
 * 1.创建配置类
 * 2.指定模板加载器,将模板存入缓存
 * 3.获取模板
 * 4.构造数据
 * 5.文件输出
 */
public class Test01 {
    @Test
    public void test01() throws Exception {
//        * 1.创建配置类
        Configuration conf = new Configuration();
//        * 2.指定模板加载器,将模板存入缓存
        FileTemplateLoader templatesLoader = new FileTemplateLoader(new File("templates"));
        conf.setTemplateLoader(templatesLoader);
//        * 3.获取模板
        Template template = conf.getTemplate("templates01.ftl");
//        * 4.构造数据
        HashMap<String, Object> dataMap = new HashMap<String, Object>();
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        dataMap.put("numbers",list);
        dataMap.put("username","古龙");

//        * 5.输出
        //template.process(dataMap,new FileWriter("E:\\ideaWorkspace\\workspace-activiti\\activiti_hrm\\CodeUtil\\testfile\\1.txt")); 输出到文件
        template.process(dataMap,new PrintWriter(System.out)); //输出到控制台

    }
}
