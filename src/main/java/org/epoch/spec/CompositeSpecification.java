package org.epoch.spec;

/**
 * <p>name:CompositeSpecification</p>
 * <pre>
 *      description:
 * </pre>
 *
 * @author Marshal Yuan
 * @date 2021/1/19
 */
public abstract class CompositeSpecification implements ISpecification {
    public abstract boolean isSatisfiedBy(Object obj);

    public ISpecification and(ISpecification spec) {
        return new AndSpecification(this, spec);
    }

    public ISpecification or(ISpecification spec) {
        return new OrSpecification(this, spec);
    }

    public ISpecification not() {
        return new NotSpecification(this);
    }
}
