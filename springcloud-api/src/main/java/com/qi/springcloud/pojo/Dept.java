package com.qi.springcloud.pojo;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

@Data
@NoArgsConstructor
@Accessors(chain = true)// 链式写法
public class Dept implements Serializable {  //序列化

    private Long deptno;   //主键
    private String dname;

    //微服务，一个服务对应一个数据库，同一个信息可能存在于不同数据库
    private String db_source;

    public Dept(String dname) {
        this.dname = dname;
    }
}
