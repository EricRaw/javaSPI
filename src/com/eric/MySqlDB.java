package com.eric;

/**
 * @author EricRaww
 * @create 2023-02-14
 * @description
 */
public class MySqlDB implements DBSearch{
    @Override
    public String search(String key) {
        return "mysql got "+key;
    }
}
