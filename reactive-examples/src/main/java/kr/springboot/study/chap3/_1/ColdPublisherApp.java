package kr.springboot.study.chap3._1;

import io.reactivex.rxjava3.core.Flowable;
import org.reactivestreams.Publisher;

public class ColdPublisherApp {

    public static void main(String[] args) {

        Flowable<Integer> flowable = Flowable.just(1, 3, 5, 7);

        flowable.subscribe(data -> {
            System.out.println("구독자 1 => " + data);
        });

        flowable.subscribe(data -> {
            System.out.println("구독자 2 => " + data);
        });


    }

}
