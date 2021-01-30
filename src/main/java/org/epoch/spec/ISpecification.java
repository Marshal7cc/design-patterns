package org.epoch.spec;

/**
 * <p>name:ISpecification</p>
 * <pre>
 *      description:
 * </pre>
 *
 * @author Marshal Yuan
 * @date 2021/1/19
 */
public interface ISpecification {
    // 校验对象是否满足条件
    boolean isSatisfiedBy(Object obj);

    // 与操作
    ISpecification and(ISpecification spec);

    // 或操作
    ISpecification or(ISpecification spec);

    // 非操作
    ISpecification not();
}
