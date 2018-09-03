package com.cg.capstoreserver.repo;




import org.springframework.data.jpa.repository.JpaRepository;


import org.springframework.stereotype.Repository;

import com.cg.capstoreserver.bean.CustomerBean;





@Repository
public interface ICustomerRepo extends JpaRepository<CustomerBean, String>{

	/*@Query("select c from CustomerBean c")
	public List<CustomerBean> searchProductByName(@Param(value = "name") String name);*/
	
}
