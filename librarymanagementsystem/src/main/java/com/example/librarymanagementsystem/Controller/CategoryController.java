package com.example.librarymanagementsystem.Controller;

import com.example.librarymanagementsystem.Model.Category;
import com.example.librarymanagementsystem.Service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Date;

@Controller
public class CategoryController {
    @Autowired
    CategoryService categoryService;

    @RequestMapping(value = "/getCategory",method = RequestMethod.GET)
    public ResponseEntity<Object> getCategory(){
        return new ResponseEntity<>(categoryService.getAll(), HttpStatus.OK);
    }

    @RequestMapping(value = "/addCategory",method = RequestMethod.POST)
    public ResponseEntity<Object> addCategory (@RequestBody Category category){
        category.setCreateDate(new Date());
        categoryService.saveCategory(category);
        return new ResponseEntity<>("Succes",HttpStatus.OK);

    }
    @RequestMapping(value = "/updateCategory",method = RequestMethod.POST)
    public ResponseEntity<Object> updateCategory (@RequestBody Category category){
        categoryService.updateCategory(category);
        return new ResponseEntity<>("Succes",HttpStatus.OK);

    }
    @RequestMapping(value = "/deleteCategory",method = RequestMethod.DELETE)
    public ResponseEntity<Object> deleteCategory (@RequestBody Long aLong){
        categoryService.deleteCategory(aLong);
        return new ResponseEntity<>("Succes",HttpStatus.OK);

    }
    @RequestMapping(value = "/Category",method = RequestMethod.GET)
    public ResponseEntity<Object> Category (){
        Category category = new Category();
        return new ResponseEntity<>(category,HttpStatus.OK);

    }
}
