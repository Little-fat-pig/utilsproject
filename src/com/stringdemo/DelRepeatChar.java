package com.stringdemo;

/*
 *@author zhangxl
 *@Date 2021/12/5 20:19
 *@description   删除字符串中重复的数字或者字母
 */


import java.util.*;

public class DelRepeatChar {
    /**
     * 方案一
     *
     * @param values
     * @return
     */
    public static String delRepeat(String values) {
        char[] chars = values.toCharArray();
        System.out.println(chars.length);
        Set<String> set = new HashSet<>();
        for (int i = 0; i < chars.length; i++) {
            set.add(Character.toString(chars[i]));
        }
        return set.toString();
    }

    /**
     * 方案二
     *
     * @param values
     * @return
     */
    public static String deleteRepeat(String values) {
        char[] chars = values.toCharArray();
        System.out.println(Arrays.toString(chars));
        String resultLetter = "";
        for (int i = 0; i < chars.length; i++) {
            if (resultLetter.indexOf(Character.toString(chars[i])) == -1) {
                resultLetter += chars[i];
            }
        }
        return resultLetter;
    }

    /**
     * 方案三
     *
     * @param values
     * @return
     */
    public static String deleteRepeatValues(String values) {
        char[] chars = values.toCharArray();
        List<String> list = new ArrayList<>(10);
        for (int i = 0; i < chars.length; i++) {
            if (!list.contains(Character.toString(chars[i]))) {
                list.add(Character.toString(chars[i]));
            }
        }
        return list.toString();
    }

    public static void main(String[] args) {
        //测试样例
        String demo="jdksajhfijusdkhfjksdljfk";
        System.out.println(DelRepeatChar.deleteRepeatValues(demo));

    }
}
