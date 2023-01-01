package kr.springboot.study.chap2;


import io.reactivex.rxjava3.core.Observable;

/**
 * CHAP2 APP
 */
public class App {

    public static void main(String[] args) {

        Observable<String> observable = Observable.just("Hello", "RxJava");
        observable.subscribe(System.out::println);

    }

}
