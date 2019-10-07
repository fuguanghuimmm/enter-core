package com.enter.core.pojo.dto.other;

import lombok.Data;

import java.io.Serializable;

/**
 * @author Liquid
 * @类名： PageInfo
 * @描述： 分页DTO
 * @date 2019/9/29
 */
@Data
public class PageInfo implements Serializable{
    private static final long serialVersionUID = 9128340445176136315L;

    /**
    *   第几页
    */
    String pageIndex;
    /**
    *   每页数量
    */
    String pageCount;
}
