package com.aip.controller;

import com.aip.pojo.Employee;
import com.aip.service.EmpService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author Aip
 * @version 1.0
 * @date 2023/8/22  18:02
 * @description
 */

//�����ʶΪ���Ʋ����
@Controller
public class EmpController {

    /**
     * Spring���Զ�װ��
     */
    @Autowired
    private EmpService empService;

    @GetMapping("/emp/page/{num}")
    public String getEmpPage(@PathVariable("num") Integer pageNum,Model model){
        PageInfo<Employee> page = empService.getEmpPage(pageNum);
        model.addAttribute("page",page);
        return "emp_list";
    }

    /**
     * ���Ա������ӹ���
     * @author Aganippe
     * @version v1.0
     * @date 2023/8/25
     * @name AddEmp
     * @param employee emp
     * @return java.lang.String
     */
    @PostMapping("/addEmp")
    public String AddEmp(Employee employee){
        empService.addEmp(employee);
        return "redirect:/emp/page/1";
    }

    /**
     * ����id����Ա�������������޸Ĺ��ܵ�ʵ��
     * @author Aganippe
     * @version v1.0
     * @date 2023/8/25
     * @name toEditPage
     * @param id id
     * @param model model
     * @return java.lang.String
     */
    @GetMapping("/emp/{id}")
    public String toEditPage(@PathVariable("id") String id, Model model){
        Employee employee = empService.queryEmpById(id);
        model.addAttribute("emp",employee);
        return "edit";
    }

    /**
     * �޸�Ա�����޸Ĺ���
     * @author Aganippe
     * @version v1.0
     * @date 2023/8/25
     * @name editEmp
     * @param employee emp
     * @return java.lang.String
     */
    @PutMapping("/emp")
    public String editEmp(Employee employee){
        empService.updateEmpById(employee);
        return "redirect:/emp/page/1";
    }

    /**
     * ����idɾ��Ա����ɾ������
     * @author Aganippe
     * @version v1.0
     * @date 2023/8/25
     * @name deleteEmp
     * @param id id
     * @return java.lang.String
     */
    @DeleteMapping("/delete/{id}")
    public String deleteEmp(@PathVariable("id") String id){
        empService.deleteEmpById(id);
        return "redirect:/emp/page/1";
    }

    /**
     * ����������ѯԱ��
     * @author Aganippe
     * @version v1.0
     * @date 2023/8/25
     * @name findEmpByName
     * @param name name
     * @param model model
     * @return java.lang.String
     */
    @PostMapping("/find/emp/{num}")
    public String findEmpByName(String name,Model model,@PathVariable("num") Integer pageNum){

        //�ַ����пգ����������Ϊ�գ����ѯ����Ա������֮������������е����ݲ�ѯԱ��
        if (name != null && name!=""){
            PageInfo<Employee> page = empService.queryEmpByName(pageNum, name);
            model.addAttribute("page",page);
        }else {
            PageInfo<Employee> page = empService.getEmpPage(pageNum);
            model.addAttribute("page",page);
        }
        return "emp_list";
    }
}
