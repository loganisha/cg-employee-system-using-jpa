package a;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "capgemini123")
class Employee {
	// public Employee1(int i, String string, String string2) {
	// TODO Auto-generated constructor stub
	// }

	@Id
	@Column(name = "testid")
	private int id;
	@Column(name = "testename")
	private String ename;
	@Column(name = "testaddress")
	private String address;
}
