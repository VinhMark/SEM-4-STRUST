package entities;
// Generated Aug 3, 2017 10:05:26 AM by Hibernate Tools 5.2.3.Final

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

/**
 * Role generated by hbm2java
 */
@Entity
@Table(name = "Role", catalog = "mydemo")
public class Role implements java.io.Serializable {

	private int id;
	private String name;
	private Set<Account> accounts = new HashSet<Account>(0);

	public Role() {
	}

	public Role(int id) {
		this.id = id;
	}

	public Role(int id, String name, Set<Account> accounts) {
		this.id = id;
		this.name = name;
		this.accounts = accounts;
	}

	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Column(name = "name", length = 50)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "Account_Role", catalog = "mydemo", joinColumns = {
			@JoinColumn(name = "RoleId", nullable = false, updatable = false) }, inverseJoinColumns = {
					@JoinColumn(name = "AccountId", nullable = false, updatable = false) })
	public Set<Account> getAccounts() {
		return this.accounts;
	}

	public void setAccounts(Set<Account> accounts) {
		this.accounts = accounts;
	}

}
