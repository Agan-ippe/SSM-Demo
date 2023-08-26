package com.aip.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Aip
 * @version 1.0
 * @date 2023/8/21  16:49
 * @description
 */

@Data
//提供全参构造
@AllArgsConstructor
//无参构造
@NoArgsConstructor
public class Employee {
    /**
     * 员工工号
     */
    private String empId;

    /**
     * 员工姓名
     */
    private String empName;

    /**
     * 员工性别
     */
    private String sex;

    /**
     * 员工邮箱
     */
    private String email;

    /**
     * 员工所属部门
     */
    private String deptName;

}
