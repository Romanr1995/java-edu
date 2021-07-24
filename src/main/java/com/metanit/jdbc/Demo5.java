package com.metanit.jdbc;

import java.sql.Connection;
import java.sql.Date;
import java.util.Optional;
import com.metanit.jdbc.dao.JournalRecord;
import com.metanit.jdbc.dao.JournalRecordDao2;

public class Demo5 {
    public static void main(String[] args) throws Exception {
        final Connection conn = ConnectionManager.getConnection();

        JournalRecordDao2 dao = new JournalRecordDao2(conn);

        JournalRecord r = new JournalRecord("foo", "bar", "me", new Date(System.currentTimeMillis()));
        JournalRecord r2 = new JournalRecord("qwe", "bar", "me", new Date(System.currentTimeMillis() + 100));

        dao.create(r);
        dao.create(r2);
        System.out.println(dao.tableSize());
        System.out.println(dao.containsId(4L));
        final JournalRecord rec = dao.findById(1L).orElseThrow(() -> new RuntimeException("Объект не найден"));

        rec.setAuthor("Roman");
        dao.update(rec);

        System.out.println("dao.findById(rec.getId()).orElseThrow() = " + dao.findById(rec.getId()).orElseThrow());

        dao.deleteById(rec.getId());

        JournalRecord rec2 = dao.findById(rec.getId()).orElseThrow();
    }
}
