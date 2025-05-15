package com.xuecheng.base.model;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @description 分页查询通用接口
 * @author Sirmem
 * @date 2025/5/12
 * @version 1.0
 */

@Data
@ToString
@NoArgsConstructor
public class PageParams {

    //当前页码
    @ApiModelProperty("当前页码")
    private Long pageNo = 1L;

    //每页记录查询默认值
    @ApiModelProperty("每页记录数默认值")
    private Long PageSize = 10L;

    public PageParams(Long pageNo, Long pageSize) {
        this.pageNo = pageNo;
        this.PageSize = pageSize;
    }



}
