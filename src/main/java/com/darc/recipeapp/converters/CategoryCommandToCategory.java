package com.darc.recipeapp.converters;

import com.darc.recipeapp.commands.CategoryCommand;
import com.darc.recipeapp.domain.Category;
import lombok.Synchronized;
import org.springframework.stereotype.Component;

@Component
public class CategoryCommandToCategory implements Converter<CategoryCommand, Category>{

    @Synchronized
    @Nullable
    @Override
    public Category convert(CategoryCommand source) {
        if (source == null) {
            return null;
        }

        final Category category = new Category();
        category.setId(source.getId());
        category.setDescription(source.getDescription());
        return category;
    }
}
