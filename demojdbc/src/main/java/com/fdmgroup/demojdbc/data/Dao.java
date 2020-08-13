package com.fdmgroup.demojdbc.data;

import java.util.List;

public interface Dao<T, U> {

	void create(T t);
	T read(U u);
	void update (T t);
	void delete (U u);
	List<T> read();
	
}
