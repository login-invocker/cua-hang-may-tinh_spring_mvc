package entity;

import java.sql.Timestamp;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity(name = "sub_categories")
public class Sub_Categories {
	@Id
	private int id;
	private int id_categories;
	private int id_sub_categoies;
	private int create_by;
	private int update_by;
	private Timestamp create_at;
	private Timestamp update_at;
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "d_sub_categories_categories",
	joinColumns ={@JoinColumn(name="id_sub_categories",referencedColumnName = "id_sub_categories")},
	inverseJoinColumns = {@JoinColumn(name="id_categories",referencedColumnName = "id_categories")})
	Set<Categories> categories;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getId_categories() {
		return id_categories;
	}
	public void setId_categories(int id_categories) {
		this.id_categories = id_categories;
	}
	public int getId_sub_categoies() {
		return id_sub_categoies;
	}
	public void setId_sub_categoies(int id_sub_categoies) {
		this.id_sub_categoies = id_sub_categoies;
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
	public Set<Categories> getCategories() {
		return categories;
	}
	public void setCategories(Set<Categories> categories) {
		this.categories = categories;
	}
}
