package com.company;

import rx.Observable;
import rx.functions.Action1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
//
//        Comparator<String> stringComparable = new Comparator<String>() {
//            @Override
//            public int compare(String s, String t1) {
//                return s.compareTo(t1);
//            }
//
//        };
//
//        Comparator<String> stringComparator = (String s1, String s2) -> {
//            return s1.compareTo(s2);
//        };
//
//        int num = stringComparable.compare("hello", "world");
//        System.out.println(num);
//
//        int comparisonRes = stringComparator.compare("hello", "world");
//        System.out.println(comparisonRes);

        TestInterface testInterface = (String s1) -> {
            System.out.println("hii");
            System.out.println(s1);
        };
        testInterface.apply("bye");
    }

    public static void reactiveProgramming(){
        List<String> arrayList = Arrays.asList("GOOG", "AAPL", "MSFT");
        Observable<StockInfo> feed = StockServer.getFeed(arrayList);
        feed.subscribe(new Action1<StockInfo>() {
            @Override
            public void call(StockInfo stockInfo) {
                System.out.println(stockInfo);
            }
        });
    }
}
