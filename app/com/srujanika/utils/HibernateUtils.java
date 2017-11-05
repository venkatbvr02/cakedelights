package com.srujanika.utils;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

    public class HibernateUtils {
            public static  SessionFactory sessionFactory;
        private HibernateUtils() {
        }
//maling the Hibernate SessionFactory object as singleton

        public static synchronized SessionFactory getSessionFactory() {

            if (sessionFactory == null) {
                sessionFactory = new Configuration().configure("hibernate.cfg.xml").
                        buildSessionFactory();
            }
            return sessionFactory;
        }

//            static {
//                try {
//                    sessionFactory = new Configuration().configure()
//                            .buildSessionFactory();
//                } catch (Throwable ex) {
//                    System.err.println("Initial SessionFactory creation failed." + ex);
//                    throw new ExceptionInInitializerError(ex);
//                }
//            }
//
//            public static SessionFactory getSessionFactory() {
//                return sessionFactory;
//            }
        }

