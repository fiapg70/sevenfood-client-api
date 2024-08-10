package br.com.sevenfood.client.sevenfoodclientapi.factory;

public class ObjectFactory {
    public static ObjectFactory instance;

    private ObjectFactory() {}

    public static ObjectFactory getInstance() {
        if (instance == null) {
            instance = new ObjectFactory();
        }
        return instance;
    }
}