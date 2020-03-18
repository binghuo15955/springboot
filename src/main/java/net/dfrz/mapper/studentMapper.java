package net.dfrz.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import net.dfrz.entity.Student;

@Mapper
public interface studentMapper extends BaseMapper<Student>{
}
