package study.designpattern.creationalpattern.singleton;

public class RuntimeExample {
    public static void main(String[] args) {
        /**
         * 실제 자바에서 구현되어있는 싱글톤 예제
         * Runtime.class
         * new 키워드로 생성 불가
         */
        // Runtime runtime = new Runtime();

        Runtime runtime = Runtime.getRuntime();
        System.out.println(runtime.maxMemory());
        System.out.println(runtime.freeMemory());
    }
}
