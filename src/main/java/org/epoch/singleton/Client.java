package org.epoch.singleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * <p>name:Client</p>
 * <pre>
 *      description:
 * </pre>
 *
 * @author Marshal Yuan
 * @date 2021/1/9
 */
public class Client {
    public static void main(String[] args) throws Exception {
        EnumSingleton instance1 = null;

        EnumSingleton instance2 = EnumSingleton.getInstance();
        instance2.setData(new Object());

        FileOutputStream fos = new FileOutputStream("Enum.obj");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(instance2);
        oos.flush();
        oos.close();

        FileInputStream fis = new FileInputStream("Enum.obj");
        ObjectInputStream ois = new ObjectInputStream(fis);
        instance1 = (EnumSingleton) ois.readObject();
        ois.close();

        System.out.println(instance1.getData());
        System.out.println(instance2.getData());

        System.out.println(instance1 == instance2);
    }
}
