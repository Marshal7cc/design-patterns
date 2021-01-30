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
public class NotSpecification extends CompositeSpecification {
    private ISpecification spec;

    public NotSpecification(ISpecification spec) {
        this.spec = spec;
    }

    @Override
    public boolean isSatisfiedBy(Object obj) {
        return !spec.isSatisfiedBy(obj);
    }
}
