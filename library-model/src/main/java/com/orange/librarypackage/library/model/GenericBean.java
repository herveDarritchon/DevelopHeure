package com.orange.librarypackage.library.model;

import java.io.Serializable;

/**
 * main class for Data Transfer Objects, includes technical id, name and
 * description
 * 
 * @author Clara
 * 
 *         NOTE : Comparable interface is needed to sort a Collection of
 *         GenericBean
 */

abstract public class GenericBean implements Serializable, Comparable<Object> {

	private static final long serialVersionUID = 7707420123216585739L;

	/**
	 * empty id value
	 */
	public final static String ID_EMPTY = null;

	/**
	 * mandatory technical id
	 * 
	 */
	protected Integer id;

	/**
	 * not null and unique name
	 */
	protected String name;

	/**
	 * optimistic lock is propagated through all layers
	 */
	protected int version;

	public GenericBean() {
		id = null;
		name = "";
	}

	/**
	 * full Constructor
	 */
	public GenericBean(Integer id, String name) {
		this.id = id;
		this.name = name;
	}

	/**
	 * name/description constructor
	 */
	public GenericBean(String name) {
		this.name = name;
	}

	/**
	 * user readable output
	 */
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("bean : ");
		sb.append("version=").append(version);
		sb.append(", ");
		sb.append("id=").append(id);
		sb.append(", ");
		sb.append("name=").append(name);

		return (sb.toString());
	}

	/**
	 * Comparable bean
	 */
	public int compareTo(Object o) {
		int result = 0;

		if (o instanceof GenericBean) {
			result = getName().compareTo(((GenericBean) o).getName());
		} else if (o != null) {
			result = toString().compareTo(o.toString());
		}

		return result;
	}

	@Override
	public boolean equals(Object object) {
		return getId() != null ? object != null
				&& getClass() == object.getClass()
				&& getId().equals(((GenericBean) object).getId()) : super
				.equals(object);
	}

	@Override
	public int hashCode() {
		return getId() != null ? getId().hashCode() : super.hashCode();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}
}
