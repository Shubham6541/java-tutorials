package org.nklkarthi.web.rest;

import org.nklkarthi.web.entity.Student;
import org.nklkarthi.web.exception.MyResourceNotFoundException;
import org.nklkarthi.web.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentDirectoryRestController {

    @Autowired
    private StudentService service;

    @RequestMapping(value = "/student/get", params = { "page", "size" }, method = RequestMethod.GET, produces = "application/json")
    public Page<Student> findPaginated(@RequestParam("page") int page, @RequestParam("size") int size) {

        Page<Student> resultPage = service.findPaginated(page, size);
        if (page > resultPage.getTotalPages()) {
            throw new MyResourceNotFoundException();
        }
        return resultPage;
    }

}
