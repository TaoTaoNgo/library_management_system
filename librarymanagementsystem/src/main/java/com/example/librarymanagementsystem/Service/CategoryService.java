package com.example.librarymanagementsystem.Service;

import com.example.librarymanagementsystem.Model.Category;
import com.example.librarymanagementsystem.Repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {
    @Autowired
    CategoryRepository categoryRepository;

    public Long getTotalCount(){
        return categoryRepository.count();
    }
    public List getAll(){
        return categoryRepository.findAll();
    }
    public Category getById(Long id){
        return categoryRepository.findById(id).get();
    }
    public void saveCategory(Category category){
        categoryRepository.save(category);
    }
    public void updateCategory(Category category){
        Optional<Category> category1 = categoryRepository.findById(category.getId());
        if (category1.isPresent()){
            categoryRepository.delete(category1.get());
            categoryRepository.save(category);
        }
    }
    public void deleteCategory(Long id){
        Optional<Category> category = categoryRepository.findById(id);
        if(category.isPresent())
        categoryRepository.delete(category.get());
    }
}
