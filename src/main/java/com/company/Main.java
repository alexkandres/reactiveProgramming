package com.company;

import rx.Observable;
import rx.Subscription;
import rx.functions.Action1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        String[] letters = {"a", "b", "c", "d", "e", "f", "g"};

        ObservableClass observableClass = new ObservableClass();
        observableClass.observable = Observable.from(letters);
        Subscription subscribe = observableClass.observable.subscribe(s -> observableClass.result += s);
        System.out.println(observableClass.result.equals("abcdefg"));
        System.out.println(observableClass.result);

    }
















    public static void reactiveProgramming(){

//        TestInterface testInterface = (String s1) -> {
//            System.out.println("hii");
//            System.out.println(s1);
//        };
//        testInterface.apply("bye");
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
