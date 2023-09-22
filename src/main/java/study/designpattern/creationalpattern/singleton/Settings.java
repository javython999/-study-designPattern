package study.designpattern.creationalpattern.singleton;

import java.io.Serializable;

public class Settings implements Serializable {

    /*
    아래 코드는 싱글톤으로 인스턴스를 생성 할 수 있지만 멀티쓰레드 환경에서는 안전하지 않다.
    private static Settings instance;

    private Settings() {
        // 생성자를 private으로 하면 클래스 밖에서는 생성자로 인스턴스를 만들 수 없게 된다.
    }

    public static Settings getInstance() {

        if(instance == null) {
            instance = new Settings();
        }
        return instance;
    }
    */


    /*
    synchronized 키워드를 사용해 동기화 시키면 멀티쓰레드 환경에서 안전하다.
    하지만 getInstance()를 호출 할때마다 동기화 처리를 하는 작업 때문에 성능 저하가 발생 할 수 있다.

    private static Settings instance;

    public static synchronized Settings getInstance() {
        if(instance == null) {
          instance = new Settings();
        }
        return instance;
    }
    */


    /*
    이른 초기화(eager initialization) 사용하기
    인스턴스 생성시에 많은 자원이 소모되거나 시간이 걸리는 경우 미리 생성하는 점이 단점이 될 수 있다.
    private static final Settings INSTANCE = new Settings();
    private Settings() {}
    public static Settings getInstance() {
        return INSTANCE;
    }
    */

    /*
    double checked locking
    volatile 키워드 추가해야 한다.
    volatile 동작 원리는 복잡하다. 1.5이후 버전부터 사용가능하다.
    private static volatile Settings instance;

    private Settings() {}

    public static  Settings getInstance() {
        if(instance == null) {
            synchronized(Settings.class) {
                if(instance == null) {
                    instance = new Settings();
                }
            }
        }
        return instance;
    }
    */


    // static inner class
    private Settings() {}

    private static class SettingsHolder {
        private static final Settings INSTANCE = new Settings();
    }

    public static  Settings getInstance() {
        return SettingsHolder.INSTANCE;
    }


}
