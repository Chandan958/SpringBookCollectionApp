package com.rk.model;

import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OrderColumn;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "empTab")
public class Employee {
	@Id
	@Column(name = "eid")
	private Integer empId;
	@Column(name = "ename")
	private String empName;
	@Column(name = "esal")
	private Double empSal;
	@ElementCollection
	@CollectionTable(name = "projtab",joinColumns = @JoinColumn(name  = "eid"))
	@Column(name = "proj")
	private Set<String> empProj;
	@ElementCollection
	@CollectionTable(name = "modulestab",joinColumns = @JoinColumn(name  = "eid"))
	@Column(name = "modules")
	@OrderColumn(name = "pos")
	private List<String> empModules;
	@ElementCollection
	@CollectionTable(name = "clienttab",joinColumns = @JoinColumn(name  = "eid"))
	@Column(name = "proj")
	private Map<String, String> empClient;
}
