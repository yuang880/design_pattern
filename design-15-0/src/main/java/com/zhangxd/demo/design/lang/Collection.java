package com.zhangxd.demo.design.lang;

/**
 * @author zhangxd
 * @version 1.0 2023/4/15
 */
public interface Collection<E, L> extends Iterable<E> {

    boolean add(E e);

    boolean remove(E e);

    boolean addLink(String key, L l);

    boolean removeLink(String key);

    Iterator<E> iterator();

}
