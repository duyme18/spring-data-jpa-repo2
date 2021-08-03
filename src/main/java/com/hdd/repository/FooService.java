package com.hdd.repository;

import org.springframework.beans.factory.annotation.Autowired;

public class FooService implements IFooService{
    @Autowired
    private IFooDAO dao;

    @Override
    public Foo create(Foo foo) {
        return dao.save(foo);
    }
}
