package com.metanit.jdbc;

import java.sql.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * Нужно создать таблицу,заполнить ее данными 20+ строк
 * Cars (id int, brand varchar(100), model varchar(100), price int, qty int, year date);
 * Написать программу на jave,которая подключючится к этой БД и прочиатает данные из этой таблицы.
 * Суммарная стоимость всех машин,суммарная стоимость всех машин по брендам,отсортировать:сначала самые новые машины,
 * затем самые дорогие(если две одного года)
 */

public class DemoCode1 {
    static class Cars {
        int id;
        String brand;
        String model;
        int price;
        int qty;
        Date year;

        public Cars(int id, String brand, String model, int price, int qty, Date year) {
            this.id = id;
            this.brand = brand;
            this.model = model;
            this.price = price;
            this.qty = qty;
            this.year = year;
        }

        public static Comparator<Cars> sortCars() {
            return (lhs, rhs) -> {
                if (!lhs.year.equals(rhs.year)) {
                  return rhs.year.compareTo(lhs.year);
                } else {
                  return Integer.compare(rhs.price, lhs.price);
                }
            };
        }
    }

    public static void main(String[] args) throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");

        try (Connection conn =
                     DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "roman", "12345")) {

            Statement stmt = conn.createStatement();

//            stmt.execute("update cars \n" +
//                    "set brand = 'Hyundai'\n" +
//                    "where id = 18");

//            stmt.execute("INSERT INTO cars (id,brand,model,price,qty,year) " +
//                    "values(4, 'BMW','X6',2700000, 1,'2014-01-01')");
//            stmt.execute("INSERT INTO cars (id,brand,model,price,qty,year) " +
//                    "values(5, 'Mercedes','G63',8000000, 2,'2015-01-01')");
//            stmt.execute("INSERT INTO cars (id,brand,model,price,qty,year) " +
//                    "values(6, 'Mercedes','C63',5000000, 1,'2016-01-01')");
//
//            stmt.execute("INSERT INTO cars (id,brand,model,price,qty,year) " +
//                    "values(7, 'BMW','M8',16000000, 1,'2019-01-01')");
//            stmt.execute("INSERT INTO cars (id,brand,model,price,qty,year) " +
//                    "values(8, 'Toyota','Camry',2500000, 2,'2018-01-01')");
//            stmt.execute("INSERT INTO cars (id,brand,model,price,qty,year) " +
//                    "values(9, 'Toyota','Land Cruiser200',4000000, 3,'2017-01-01')");
//
//            stmt.execute("INSERT INTO cars (id,brand,model,price,qty,year) " +
//                    "values(10, 'Tesla','Model X',8000000, 1,'2012-01-01')");
//            stmt.execute("INSERT INTO cars (id,brand,model,price,qty,year) " +
//                    "values(11, 'Skoda','Octavia',1900000, 2,'2020-01-01')");
//            stmt.execute("INSERT INTO cars (id,brand,model,price,qty,year) " +
//                    "values(12, 'Kia','K5',2300000, 4,'2016-01-01')");
//
//            stmt.execute("INSERT INTO cars (id,brand,model,price,qty,year) " +
//                    "values(13, 'Nissan','X-Trail',2300000, 2,'2020-01-01')");
//            stmt.execute("INSERT INTO cars (id,brand,model,price,qty,year) " +
//                    "values(14, 'Kia','Sportage',2000000, 1,'2021-01-01')");
//            stmt.execute("INSERT INTO cars (id,brand,model,price,qty,year) " +
//                    "values(15, 'Volkswagen','Tiguan',2200000, 1,'2018-01-01')");
//
//            stmt.execute("INSERT INTO cars (id,brand,model,price,qty,year) " +
//                    "values(16, 'Volkswagen','Polo',1200000, 1,'2017-01-01')");
//            stmt.execute("INSERT INTO cars (id,brand,model,price,qty,year) " +
//                    "values(17, 'Hyundai','Creta',1300000, 3,'2019-01-01')");
//            stmt.execute("INSERT INTO cars (id,brand,model,price,qty,year) " +
//                    "values(18, 'Hyunday','Solaris',1300000, 1,'2021-01-01')");
//
//            stmt.execute("INSERT INTO cars (id,brand,model,price,qty,year) " +
//                    "values(19, 'Tesla','Model 3',3900000, 2,'2020-01-01')");
//            stmt.execute("INSERT INTO cars (id,brand,model,price,qty,year) " +
//                    "values(20, 'Nissan','Qashqai',2000000, 2,'2019-01-01')");
//            stmt.execute("INSERT INTO cars (id,brand,model,price,qty,year) " +
//                    "values(21, 'Skoda','Rapid',1500000, 1,'2013-01-01')");

            String sql = "select * from cars";
            ResultSet resultSet = stmt.executeQuery(sql);

            long sumTotal = 0;
            int sumBMW = 0;
            int sumAudi = 0;
            int sumHonda = 0;
            int sumMercedes = 0;
            int sumTayota = 0;
            int sumTesla = 0;
            int sumScoda = 0;
            int sumKia = 0;
            int sumNissan = 0;
            int sumVolkswagen = 0;
            int sumHyundai = 0;

            List<Cars> car = new ArrayList<>();

            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String brand = resultSet.getString("brand");
                String model = resultSet.getString("model");
                int price = resultSet.getInt("price");
                int qty = resultSet.getInt("qty");
                Date year = resultSet.getDate("year");
                car.add(new Cars(id, brand, model, price, qty, year));

            }


            for (int i = 0; i < car.size(); i++) {
                sumTotal += car.get(i).price*car.get(i).qty;
            }
            System.out.println("Total cost of all cars = " + sumTotal);

            for (int k = 0; k < car.size(); k++) {
                switch (car.get(k).brand) {
                    case "BMW": sumBMW+=car.get(k).price*car.get(k).qty;
                                break;
                    case "Audi": sumAudi+=car.get(k).price*car.get(k).qty;
                        break;
                    case "Honda": sumHonda+=car.get(k).price*car.get(k).qty;
                        break;
                    case "Mercedes": sumMercedes+=car.get(k).price*car.get(k).qty;
                        break;
                    case "Toyota": sumTayota+=car.get(k).price*car.get(k).qty;
                        break;
                    case "Tesla": sumTesla+=car.get(k).price*car.get(k).qty;
                        break;
                    case "Skoda": sumScoda+=car.get(k).price*car.get(k).qty;
                        break;
                    case "Kia": sumKia+=car.get(k).price*car.get(k).qty;
                        break;
                    case "Nissan": sumNissan+=car.get(k).price*car.get(k).qty;
                        break;
                    case "Volkswagen": sumVolkswagen+=car.get(k).price*car.get(k).qty;
                        break;
                    case "Hyundai": sumHyundai+=car.get(k).price*car.get(k).qty;
                        break;
                }
            }
            long sumTotal1 = sumBMW + sumAudi + sumHonda + sumMercedes + sumTayota + sumTesla + sumScoda + sumKia +
                    + sumNissan + sumVolkswagen + sumHyundai;
            System.out.println("Total cost of all cars = " + sumTotal1);

            car.sort(Cars.sortCars());
        }

    }

}

