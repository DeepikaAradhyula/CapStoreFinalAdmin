package com.cg.capstoreserver.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.capstoreserver.bean.MerchantBean;
@Repository
public interface IMerchantRepo extends JpaRepository<MerchantBean, String> {

	
}
