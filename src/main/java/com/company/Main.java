package com.company;

import java.util.Arrays;
import java.util.List;

import static java.util.stream.Collectors.toList;

public class Main {

    public static void main(String[] args) {
	// write your code here
        List<String> arrayList = Arrays.asList("GOOG", "AAPL", "MSFT");
        StockServer.getFeed(arrayList);
        System.out.println(arrayList.stream().collect(toList()));
    }
}
