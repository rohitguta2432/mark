package com.api.services;

public interface MarkService<T> {

	T save(T entity);

	T update(String id, T entity);

	T get(String id);

	
}
