package org.epoch.spec;

/**
 * <p>name:AndSpecification</p>
 * <pre>
 *      description:
 * </pre>
 *
 * @author Marshal Yuan
 * @date 2021/1/19
 */
public class BizSpecification extends CompositeSpecification {
    private String obj;

    public BizSpecification(String obj) {
        this.obj = obj;
    }

    @Override
    public boolean isSatisfiedBy(Object obj) {
        return true;
    }
}
