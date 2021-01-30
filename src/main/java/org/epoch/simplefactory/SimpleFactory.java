package org.epoch.simplefactory;

/**
 * <p>name:SimpleFactory</p>
 * <pre>
 *      description:
 * </pre>
 *
 * @author Marshal Yuan
 * @date 2021/1/6
 */
public class SimpleFactory {
    private static final String PRODUCT_A = "A";
    private static final String PRODUCT_B = "B";

    public static IProduct create(String type) {
        if (PRODUCT_A.equals(type)) {
            return new ProductA();
        } else if (PRODUCT_B.equals(type)) {
            return new ProductB();
        } else {
            return null;
        }
    }
}
