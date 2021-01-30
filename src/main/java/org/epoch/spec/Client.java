package org.epoch.spec;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>name:Client</p>
 * <pre>
 *      description:
 * </pre>
 *
 * @author Marshal Yuan
 * @date 2021/1/19
 */
public class Client {
    public static void main(String[] args) {
        List<Object> list = new ArrayList<Object>();
        ISpecification spec1 = new BizSpecification("a");
        ISpecification spec2 = new BizSpecification("b");

        for (Object obj : list) {
            boolean res1 = spec1.and(spec2).isSatisfiedBy(obj);
            boolean res2 = spec1.or(spec2).isSatisfiedBy(obj);
            boolean res4 = spec1.not().isSatisfiedBy(obj);
            boolean res3 = spec2.not().isSatisfiedBy(obj);
        }
    }
}
