package com.knowyourneighborhood.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

import com.knowyourneighborhood.dao.StoreDAO;
import com.knowyourneighborhood.model.Store;

@Service
@ComponentScan("com.knowyourneighborhood.dao")
public class StoreService {
	@Autowired
	private StoreDAO storeDao;

	public List<Store> getAllStores(){
		return storeDao.getStores();
	}

	public Store saveStoreRecord(Store store) {
		store = storeDao.setStores(store);
		return store;
	}
	
}
