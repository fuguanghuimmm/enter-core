package com.enter.core.pojo;

/**
 * @author Liquid
 * @类名： VoConvertible
 * @描述：
 * @date 2019/10/1
 */
public interface VoConvertible<V,T> {

    V convertToVO(T t);

    T convertToDTO(V v);
}
