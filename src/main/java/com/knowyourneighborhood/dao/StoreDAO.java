package com.knowyourneighborhood.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.knowyourneighborhood.model.Store;

@Repository
public class StoreDAO {
	private List<Store> stores = new ArrayList<>();

	public List<Store> getStores() {
		return stores;
	}

	public Store setStores(Store store) {
		stores.add(store);
		return store;
	}
}
