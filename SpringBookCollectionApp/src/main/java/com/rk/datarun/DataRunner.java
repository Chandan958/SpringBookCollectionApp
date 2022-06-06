package com.rk.datarun;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.rk.model.Employee;
import com.rk.repo.EmployeeRepository;
@Component
public class DataRunner implements CommandLineRunner{
	@Autowired
	private EmployeeRepository repo;
	
	@Override
	public void run(String... args) throws Exception {
		Set s = new LinkedHashSet();
		s.add("P1");
		s.add("P2");
		s.add("P3");
		Map<String, String> m = new LinkedHashMap<String, String>();
		m.put("C1", "RK");
		m.put("C2", "Oracle");
		repo.save(new Employee(10, "A", 3.3, s, Arrays.asList("M1","M2"), m));
		
	}

}
