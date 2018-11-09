package com.ssm.test;

import com.ssm.dao.UserMapper;
import com.ssm.model.User;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {


    private static UserMapper userMapper;

    public static void main(String[] args) {
//        Novel novel=novelMapper.selectByPrimaryKey(1);
//        List<Chapter> chapters=novel.getChapters();
//        System.out.println(chapters.get(0).getName());
//        User user=userMapper.selectByPrimaryKey(9);
//        System.out.println(user.getUsername());
        String lineTxt=" 第四百一十五章 昔日遗从，杀戮之仆；遗弃之地，神格之乱";
        Pattern p=Pattern.compile("(第([\\u4e00-\\u9fa5]{1,7}|[0-9]{1,5})章).*");
        Matcher m;
        m=p.matcher(lineTxt);
        System.out.println(m.matches());
    }
}
