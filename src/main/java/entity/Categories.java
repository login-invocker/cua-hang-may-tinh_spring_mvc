package entity;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity(name = "d_categories")
public class Categories implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String picture;
	private int id_categories;
	private int create_by;
	private int update_by;
	private Timestamp create_at;
	private Timestamp update_at;
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "d_categories_trademark",
	joinColumns ={@JoinColumn(name="id_categories",referencedColumnName = "id_categories")},
	inverseJoinColumns = {@JoinColumn(name="id_trademark",referencedColumnName = "id_trademark")})
	Set<Trademark> trademark;
	public Set<Sub_Categories> getSub_categories() {
		return sub_categories;
	}

	public void setSub_categories(Set<Sub_Categories> sub_categories) {
		this.sub_categories = sub_categories;
	}
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "d_sub_categories_categories",
	joinColumns ={@JoinColumn(name="id_categories",referencedColumnName = "id_categories")},
	inverseJoinColumns = {@JoinColumn(name="id_sub_categories",referencedColumnName = "id_sub_categories")})
	Set<Sub_Categories> sub_categories;
	public int getId() {
		return id;
	}
	
	public Set<Trademark> getTrademark() {
		return trademark;
	}

	public void setTrademark(Set<Trademark> trademark) {
		this.trademark = trademark;
	}

	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPicture() {
		return picture;
	}
	public void setPicture(String picture) {
		this.picture = picture;
	}
	public int getId_categories() {
		return id_categories;
	}
	public void setId_categories(int id_categories) {
		this.id_categories = id_categories;
	}
	public int getCreate_by() {
		return create_by;
	}
	public void setCreate_by(int create_by) {
		this.create_by = create_by;
	}
	public int getUpdate_by() {
		return update_by;
	}
	public void setUpdate_by(int update_by) {
		this.update_by = update_by;
	}
	public Timestamp getCreate_at() {
		return create_at;
	}
	public void setCreate_at(Timestamp create_at) {
		this.create_at = create_at;
	}
	public Timestamp getUpdate_at() {
		return update_at;
	}
	public void setUpdate_at(Timestamp update_at) {
		this.update_at = update_at;
	}

	
}
