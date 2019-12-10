package com.perye.dokit.repository;

import com.perye.dokit.entity.ColumnInfo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author perye
 * @email peryedev@gmail.com
 * @date 2019/12/10 10:28 下午
 */
public interface ColumnInfoRepository extends JpaRepository<ColumnInfo,Long> {

    List<ColumnInfo> findByTableNameOrderByIdAsc(String tableName);
}
