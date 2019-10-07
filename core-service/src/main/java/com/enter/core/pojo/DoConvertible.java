package com.enter.core.pojo;

/**
 * @className DTOConvert
 * @auther Liquid
 * @description
 * @date 2018/12/22
 */
public interface DoConvertible<D, T> {
    D convertToDO(T t);

    T convertToDTO(D d);
}
