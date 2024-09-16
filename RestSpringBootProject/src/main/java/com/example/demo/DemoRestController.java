package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class DemoRestController {

    @GetMapping("/restdemo")
    public String restDemo() {
        return "This is the rest API";
        
    }
    @GetMapping("/demobean")
    public StudentBean getStudentBean() {
    	return new StudentBean("Sada",34,99);
}

    @GetMapping("/demobeans")
    public List<StudentBean> getStudentBeans()
    {
    	List<StudentBean> students=new ArrayList<>();
    	students.add(new StudentBean("Sadanand",34,99));
    	students.add(new StudentBean("Sada",35,99.5f));
    	students.add(new StudentBean("Modi",36,99.6f));
    	students.add(new StudentBean("Sadanand Modi",37,100));
		return students;
    }
    @GetMapping("/student/{name}/{roll}/{mark}")
    public StudentBean getPathVariable(@PathVariable("name") String name,
                                       @PathVariable("roll") int roll,
                                       @PathVariable("mark") float mark) {
        return new StudentBean(name, roll, mark);
    }
}

