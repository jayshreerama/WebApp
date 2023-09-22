package test;

import Product.Product;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.Scanner;

public class InsertProduct {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter Product Id");
        int id=sc.nextInt();
        System.out.println("Enter Product Name");
        String name=sc.next();
        System.out.println("Enter Product Price");
        double price=sc.nextDouble();
        System.out.println("Enter Product Category");
        String category=sc.next();
        System.out.println("Enter Product Quantity");
        int qnt=sc.nextInt();

        Configuration cfg=null;
        SessionFactory factory=null;
        Session ses=null;
        Transaction tran=null;

        cfg=new Configuration();
        cfg=cfg.configure();
        cfg=cfg.addAnnotatedClass(Product.class);
        factory=cfg.buildSessionFactory();
        ses=factory.openSession();

       Product p=new Product();
        p.setProductId(id);
        p.setProductName(name);
        p.setProductPrice(price);
        p.setProductCategory(category);
        p.setProductQnt(qnt);

        tran=ses.beginTransaction();
        ses.save(p);
        tran.commit();
        System.out.println("Product Added Successfully");
    }
}
