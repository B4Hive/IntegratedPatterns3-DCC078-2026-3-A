package b4hive.factories;

public class SingletonFactoryMethod {

    private static SingletonFactoryMethod instance;

    private SingletonFactoryMethod() {}

    public static SingletonFactoryMethod getInstance() {
        if (instance == null) {
            instance = new SingletonFactoryMethod();
        }
        return instance;
    }

    public AbstractFactory createFactory(String tipo) {
        Class<?> c = null;
        Object o = null;
        try {
            c = Class.forName("b4hive.factories.Factory" + tipo);
            o = c.getConstructor().newInstance();
        } catch (Exception e) {
            throw new IllegalArgumentException();
        }
        return (AbstractFactory) o;
    }

}
