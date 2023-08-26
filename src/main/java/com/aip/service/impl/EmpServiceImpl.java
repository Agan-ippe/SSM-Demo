package com.aip.service.impl;

import com.aip.dao.EmpMapper;
import com.aip.pojo.Employee;
import com.aip.service.EmpService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author Aip
 * @version 1.0
 * @date 2023/8/21  17:56
 * @description
 */
@Service
@Transactional
public class EmpServiceImpl implements EmpService {

    @Autowired
    private EmpMapper empMapper;

    @Override
    public int addEmp(Employee employee) {
        return empMapper.addEmp(employee);
    }

    @Override
    public int deleteEmpById(String id) {
        return empMapper.deleteEmpById(id);
    }

    @Override
    public int updateEmpById(Employee employee) {
        return empMapper.updateEmpById(employee);
    }

    @Override
    public Employee queryEmpById(String id) {
        return empMapper.queryEmpById(id);
    }

    @Override
    public List<Employee> queryAllEmp() {
        return empMapper.queryAllEmp();
    }

    @Override
    public PageInfo<Employee> queryEmpByName(Integer pageNum,String name) {
        PageHelper.startPage(pageNum,10);
        List<Employee> list = empMapper.queryEmpByName(name);
        PageInfo<Employee> page = new PageInfo<>(list,3);
        return page;
    }

    @Override
    public PageInfo<Employee> getEmpPage(Integer pageNum) {
        PageHelper.startPage(pageNum,5);
        List<Employee> list = empMapper.queryAllEmp();
        PageInfo<Employee> page = new PageInfo<>(list, 5);
        return page;
    }


}
