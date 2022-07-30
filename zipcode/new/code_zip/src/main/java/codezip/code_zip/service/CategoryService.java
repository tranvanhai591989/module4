package codezip.code_zip.service;

import codezip.code_zip.dto.requestDto.CategoryRequestDto;
import codezip.code_zip.dto.responseDto.CategoryResponseDto;
import codezip.code_zip.model.Category;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CategoryService {
    public Category getCategory(Long categoryId);

    public CategoryResponseDto addCategory(CategoryRequestDto categoryRequestDto);

    public CategoryResponseDto getCategoryById(Long categoryId);

    public List<CategoryResponseDto> getCategories();

    public CategoryResponseDto deleteCategory(Long categoryId);

    public CategoryResponseDto editCategory(Long categoryId, CategoryRequestDto categoryRequestDto);
}
