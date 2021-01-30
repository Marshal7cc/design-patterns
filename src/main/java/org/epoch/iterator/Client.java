package org.epoch.iterator;

/**
 * <p>name:Client</p>
 * <pre>
 *      description:
 * </pre>
 *
 * @author Marshal Yuan
 * @date 2021/1/17
 */
public class Client {
    public static void main(String[] args) {
        ListAggregate<String> list = new ListAggregate<String>();
        list.add("marshal1");
        list.add("marshal2");

        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
