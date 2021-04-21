package com.GuraHafi.services.jpaservices;

import com.GuraHafi.domain.Customer;
import com.GuraHafi.services.plainservices.CustomerService;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import java.util.List;

@Service
public class CustomerServiceImpl extends AbstractJpaDaoService implements CustomerService {


    @Override
    public List<?> listAll() {
        return null;
    }

    @Override
    public Customer getById(Integer id) {
        return null;
    }

    @Override
    public Customer saveOrUpdate(Customer domainObject) {
        return null;
    }

    @Override
    public void delete(Integer id) {

    }
}
