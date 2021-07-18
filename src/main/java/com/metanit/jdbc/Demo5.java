package com.metanit.jdbc;

import java.sql.Connection;
import java.sql.Date;
import com.metanit.jdbc.dao.JournalRecord;
import com.metanit.jdbc.dao.JournalRecordDao2;

public class Demo5 {
    public static void main(String[] args) throws Exception {
        final Connection conn = ConnectionManager.getConnection();

        JournalRecordDao2 dao = new JournalRecordDao2(conn);

        dao.create(new JournalRecord(1L, "foo", "bar", "me", new Date(System.currentTimeMillis())));
    }
}
