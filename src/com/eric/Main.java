package com.eric;

import java.util.ServiceLoader;

public class Main {

    public static void main(String[] args) {
        ServiceLoader<DBSearch> serviceLoader = ServiceLoader.load(DBSearch.class);
        serviceLoader.forEach(loader -> System.out.println(loader.search("eric")));
    }
}
