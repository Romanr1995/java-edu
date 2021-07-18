package com.metanit.jdbc.dao;

import java.sql.Date;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AbstractDaoTest {

//    @Test
//    public void testGenerateInsertSql() {
//        AbstractDao<Data, Long> dao = new AbstractDao<Data, Long>(null) {
//            @Override
//            public String getTableName() {
//                return "DATA";
//            }
//
//            @Override
//            public List<String> getColumnList() {
//                return Arrays.asList("id", "name", "date");
//            }
//        };
//
//
//        assertEquals(
//                "insert into DATA (id,name,date) values (?,?,?)",
//                dao.generateInsertSql()
//        );
//    }


    static class Data {
        Long id;
        String name;
        Date date;
    }

}