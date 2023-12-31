package study.designpattern.creationalpattern.singleton;

import org.junit.jupiter.api.Test;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.nio.file.Files;
import java.nio.file.Path;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class SingletonTests {

    @Test
    void singletonTest() {
        Settings settings1 = Settings.getInstance();
        Settings settings2 = Settings.getInstance();
        assertThat(settings1).isEqualTo(settings2);
    }


    /**
     * static inner class 방법으로 구현한 Singleton 깨트리는 방법
     * java 리플렉션 사용으로 new Settings()와 같은 효과
     */
    @Test
    void singletonBreak1() throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Settings settings1 = Settings.getInstance();

        Settings settings2 = null;
        Constructor<Settings> constructor = Settings.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        settings2 = constructor.newInstance();

        assertThat(settings1).isNotEqualTo(settings2);
    }


    /**
     * 직렬화 & 역직렬화를 사용해서 Singleton 깨트리는 방법
     */
    @Test
    void singletonBreak2() throws IOException, ClassNotFoundException {
        Settings settings1 = Settings.getInstance();

        try(ObjectOutput output = new ObjectOutputStream(new FileOutputStream("settings.obj"))) {
            output.writeObject(settings1);
        }

        Settings settings2 = null;
        try(ObjectInput input = new ObjectInputStream(new FileInputStream("settings.obj"))) {
            settings2 = (Settings) input.readObject();
        }
        Files.delete(Path.of("settings.obj"));
        assertThat(settings1).isNotEqualTo(settings2);
    }

    /**
     * enum으로 선언하면 java 리플렉션을 막을 수 있다.
     * 미리 생성된다는 점(lazy-loading 불가), 상속을 사용할 수 없다는 점이 단점이다.
     */
    @Test
    void enumSingletonBlockReflection() {
        EnumSettings settings1 = EnumSettings.INSTANCE;
        EnumSettings settings2 = null;

        Constructor<?>[] constructors = EnumSettings.class.getDeclaredConstructors();
        assertThatThrownBy(() -> {
            for (Constructor<?> constructor : constructors) {
                constructor.setAccessible(true);
                constructor.newInstance("INSTANCE");
            }
        }).isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    void enumSingletonBlockSerialization() throws IOException, ClassNotFoundException {
        EnumSettings settings1 = EnumSettings.INSTANCE;

        try(ObjectOutput output = new ObjectOutputStream(new FileOutputStream("settings.obj"))) {
            output.writeObject(settings1);
        }

        EnumSettings settings2 = null;
        try(ObjectInput input = new ObjectInputStream(new FileInputStream("settings.obj"))) {
            settings2 = (EnumSettings) input.readObject();
        }
        Files.delete(Path.of("settings.obj"));
        assertThat(settings1).isEqualTo(settings2);
    }

}
