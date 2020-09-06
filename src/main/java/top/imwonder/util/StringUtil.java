/*
 * @Author: Wonder2019
 * @Date: 2020-05-02 16:40:01
 * @Last Modified by: Wonder2019
 * @Last Modified time: 2020-05-02 18:00:13
 */
package top.imwonder.util;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

/**
 * StringUtil
 *
 * @description: 字符串工具类
 **/
public class StringUtil {

    /**
     * 判断是否为空字符串最优代码
     *
     * @param str
     * @return 如果为空，则返回true
     */
    public static boolean isEmpty(String str) {
        return str == null || str.trim().length() == 0;
    }

    /**
     * 判断字符串是否非空
     *
     * @param str 如果不为空，则返回true
     * @return
     */
    public static boolean isNotEmpty(String str) {
        return !isEmpty(str);
    }

    /**
     * 判断字符串是否全部为空
     *
     * @param str 如果全部为空，则返回true
     * @return
     */
    public static boolean isAllEmpty(String... strs) {
        for (String str : strs) {
            if (!isEmpty(str)) {
                return false;
            }
        }
        return true;
    }

    /**
     * 判断字符串是否全部非空
     *
     * @param str 如果全部非空，则返回true
     * @return
     */
    public static boolean isAllNotEmpty(String... strs) {
        for (String str : strs) {
            if (isEmpty(str)) {
                return false;
            }
        }
        return true;
    }

    /**
     * 将字符串转化为驼峰命名
     *
     * @param str                   要转化的字符串
     * @param regex                 分隔符
     * @param isFirstAlphaUpperCase 是否使用大驼峰命名
     * @param hasPerfix             是否要去除前缀
     * @return 转换后的字符串
     */
    public static String toCamelCase(String str, String regex, boolean isFirstAlphaUpperCase, boolean hasPerfix) {
        StringBuffer bf = new StringBuffer();
        Queue<String> qu = new LinkedList<>(Arrays.asList(str.toLowerCase().split(regex)));
        if (hasPerfix) {
            qu.poll();
        }
        if (qu.size() <= 0) {
            return "";
        }
        String head = qu.poll();
        if (isFirstAlphaUpperCase) {
            bf.append(head.substring(0, 1).toUpperCase());
            bf.append(head.substring(1));
        } else {
            bf.append(head);
        }
        for (String s : qu) {
            bf.append(s.substring(0, 1).toUpperCase());
            bf.append(s.substring(1));
        }
        return bf.toString();
    }

    /**
     * 首字母大写
     *
     * @param str
     * @return
     */
    public static String upperFirstChar(String str) {
        char chars[] = str.toCharArray();
        if (chars[0] >= 'a' && chars[0] <= 'z') {
            chars[0] -= 32;
        }
        return String.valueOf(chars);
    }
}
