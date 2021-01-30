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
public class OrSpecification extends CompositeSpecification {
    private ISpecification left;
    private ISpecification right;

    public OrSpecification(ISpecification left, ISpecification right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public boolean isSatisfiedBy(Object obj) {
        return left.isSatisfiedBy(obj) || right.isSatisfiedBy(obj);
    }
}
