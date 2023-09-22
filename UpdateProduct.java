package test;

import Product.Product;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import java.util.Scanner;

public class UpdateProduct {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter Product Id");
        int id=sc.nextInt();

        Configuration cfg=null;
        SessionFactory factory=null;
        Session ses=null;
        Transaction tran=null;

        cfg=new Configuration();
        cfg=cfg.configure();
        cfg=cfg.addAnnotatedClass(Product.class);
        factory=cfg.buildSessionFactory();
        ses=factory.openSession();

        tran=ses.beginTransaction();
        Query q=ses.createQuery("update Product p set p.productPrice=20000.25");
        int count=q.executeUpdate();
        tran.commit();

        System.out.println("Product Updated Successfully");
    }
}
