package kr.springboot.study.chap1;


import rx.Observable;
import rx.schedulers.Schedulers;

/**
 * CHAP1 APP
 */
public class App {

    public static void main(String[] args) throws InterruptedException {

        // 소개
        Observable.just(100, 200, 300, 400, 500)
                .doOnNext(data -> System.out.println(getThreadName() + " : " + "#doOnNext() : " + data))
                .subscribeOn(Schedulers.io())
                .observeOn(Schedulers.computation())
                .filter(number -> number > 300)
                .subscribe(num -> System.out.println(getThreadName() + " : result => " + num));

        Thread.sleep(100);

        System.out.println("----------------------------");

        // 마블 다이어그램 예시 1
        Observable.just(1, 25, 9, 15, 7, 30)
                .filter(x -> x > 10)
                .subscribe(System.out::println);

        System.out.println("----------------------------");

        // 마블 다이어그램 예시 2
        Observable<Integer> observable = Observable.just(2, 25, 30, 15, 6);
        observable.subscribe(System.out::println);

    }

    private static String getThreadName() {
        return Thread.currentThread().getName();
    }


}
