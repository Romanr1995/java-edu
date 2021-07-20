package com.metanit.jdbc;

import java.sql.Connection;
import java.sql.Date;
import java.util.Arrays;
import java.util.List;
import com.metanit.jdbc.dao.JournalRecord;
import com.metanit.jdbc.dao.JournalRecordDao;

public class Demo4 {
    public static void main(String[] args) throws Exception {
        Connection conn = ConnectionManager.getConnection();

        conn.setAutoCommit(false);

        try {
            conn.createStatement();

            JournalRecordDao dao = new JournalRecordDao(conn);

            long now = System.currentTimeMillis();

            List<JournalRecord> records = Arrays.asList(
                    new JournalRecord( "First Message", "hello, world", "erixon", new Date(now - 1_000_000)),
                    new JournalRecord( "Second message", "Hi", "Roman", new Date(now - 800_000)),
                    new JournalRecord( "Alert", "Fire!", "erixon", new Date(now - 10000)),
                    new JournalRecord( "Farewell", "Good bye, my friend", "erixon", new Date(now))
            );

            records.forEach(dao::create);//rec -> dao.create(rec)

            System.out.println("dao.findById(3) = " + dao.findById(3));

            dao.deleteById(1);

            try {
                dao.findById(1);
            } catch (Exception e) {
                //e.printStackTrace();
            }

            records.get(3).setAuthor("Roman");

            dao.update(records.get(3));

            System.out.println("dao.findById(4) = " + dao.findById(4));

            conn.commit();
        }
        catch (Exception e){
            conn.rollback();

            throw e;
        }
        finally {
            conn.close();
        }
    }
}
