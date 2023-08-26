package com.aip.service;

import com.aip.pojo.Employee;
import com.github.pagehelper.PageInfo;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Aip
 * @version 1.0
 * @date 2023/8/21  17:55
 * @description
 */
public interface EmpService {
    /**
     * 新增员工
     * @author Aganippe
     * @version v1.0
     * @date 2023/8/21
     * @name addEmp
     * @param employee 员工
     * @return int
     */
    int addEmp(Employee employee);

    /**
     * 根据id删除员工
     * @author Aganippe
     * @version v1.0
     * @date 2023/8/21
     * @name deleteEmpById
     * @param id id
     * @return int
     */
    int deleteEmpById(String id);


    /**
     * 根据id修改员工信息
     * @author Aganippe
     * @version v1.0
     * @date 2023/8/21
     * @name updateEmpById
     * @param employee emp
     * @return int
     */
    int updateEmpById(Employee employee);

    /**
     * 根据id查询员工信息
     * @author Aganippe
     * @version v1.0
     * @date 2023/8/21
     * @name queryEmpById
     * @param id id
     * @return com.aip.pojo.Employee
     */
    Employee queryEmpById(String id);

    /**
     * 查询所有员工
     * @author Aganippe
     * @version v1.0
     * @date 2023/8/21
     * @name queryAllEmp
     * @return java.util.List<com.aip.pojo.Employee>
     */
    List<Employee> queryAllEmp();

    /**
     * 根据员工姓名查找
     * @author Aganippe
     * @version v1.0
     * @date 2023/8/25
     * @name queryEmpByName
     * @param name name
     * @return com.aip.pojo.Employee
     */
    PageInfo<Employee> queryEmpByName(Integer pageNum, String name);


    PageInfo<Employee> getEmpPage(Integer pageNum);

}
