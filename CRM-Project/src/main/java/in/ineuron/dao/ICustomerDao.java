package in.ineuron.dao;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import in.ineuron.model.Customer;

@Repository
public interface ICustomerDao extends CrudRepository<Customer, Integer> {

	

}
