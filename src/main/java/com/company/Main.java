package com.company;

import rx.Observable;
import rx.Subscription;
import rx.functions.Action1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        ObservableClass observableClass = new ObservableClass();

        String[] letters = {"a", "b", "c", "d", "e", "f", "g"};
        Observable.from(letters)
                .map(String::toUpperCase)
                .subscribe(s ->  observableClass.result += s);
//        observableClass.observable.map(String::toUpperCase);
//        Subscription subscribe = observableClass.observable.subscribe(
//                s ->  observableClass.result += s,
//                Throwable::printStackTrace,
//                () -> observableClass.result += "_Completed");
        System.out.println(observableClass.result.equals("abcdefg_Completed"));
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
