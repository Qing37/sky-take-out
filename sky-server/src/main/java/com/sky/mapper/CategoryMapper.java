package com.sky.mapper;

import com.github.pagehelper.Page;
import com.sky.entity.Category;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CategoryMapper {
    public Page<Category> pageQuery(Category category);

    @Insert("insert into category(type, name, sort, status, create_time, update_time, create_user, update_user) " +
            "values (#{type},#{name},#{sort},#{status},#{createTime},#{updateTime},#{createUser},#{updateUser})")
    void insert(Category category);

    /**'
     * 根据id删除分类
     * @param id
     * @return
     */
    @Delete("delete from category where id =#{id}")
    void deleteById(Long id);

    /**
     * 修改分类
     * @param category
     * @return
     */
    void update(Category category);
}
