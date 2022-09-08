package com.Introduction;

public interface Company
{
    void insertCompany();

    default void updateCompany()
    {
        System.out.println("Update the company Details");
    }

    static void deleteCompany()
    {
        System.out.println("I am deleting the company Details");
    }
}
