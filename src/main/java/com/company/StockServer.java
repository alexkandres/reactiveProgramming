package com.company;

import java.util.List;
import rx.Observable;
import rx.Subscriber;

public class StockServer {
    public static Observable<StockInfo> getFeed(List<String> arrayList) {
        return Observable.create(subscriber -> processRequest(subscriber, arrayList));
    }

    private static void processRequest(Subscriber<? super StockInfo> subscriber, List<String> arrayList) {
        System.out.println("Processing...");
    }
}
