package com.hasem.toolslib

/**
 * 字符串处理工具类
 */
object StringUtils {
    /**
     * 检查字符串是否为空或只包含空格
     * @param str 要检查的字符串
     * @return 如果字符串为null或空或只包含空格，返回true
     */
    fun isBlank(str: String?): Boolean {
        return str == null || str.trim().isEmpty()
    }
    
    /**
     * 获取字符串的非空值，如果为空则返回默认值
     * @param str 原始字符串
     * @param defaultValue 默认值
     * @return 非空字符串
     */
    fun getNotNull(str: String?, defaultValue: String = ""): String {
        return str ?: defaultValue
    }
}

/**
 * 日期工具类
 */
object DateTimeUtils {
    // 实现日期相关工具方法
}

/**
 * 文件操作工具类
 */
object FileUtils {
    // 实现文件操作方法
}