package com.example.entity;

public class CoursesInfo {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column courses.CO_ID
	 * @mbg.generated  Sun Jul 08 23:52:53 CST 2018
	 */
	private Integer CO_ID;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column courses.M_ID
	 * @mbg.generated  Sun Jul 08 23:52:53 CST 2018
	 */
	private Integer M_ID;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column courses.CO_name
	 * @mbg.generated  Sun Jul 08 23:52:53 CST 2018
	 */
	private String CO_name;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column courses.CO_introduction
	 * @mbg.generated  Sun Jul 08 23:52:53 CST 2018
	 */
	private String CO_introduction;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column courses.CO_ID
	 * @return  the value of courses.CO_ID
	 * @mbg.generated  Sun Jul 08 23:52:53 CST 2018
	 */
	public Integer getCO_ID() {
		return CO_ID;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column courses.CO_ID
	 * @param CO_ID  the value for courses.CO_ID
	 * @mbg.generated  Sun Jul 08 23:52:53 CST 2018
	 */
	public void setCO_ID(Integer CO_ID) {
		this.CO_ID = CO_ID;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column courses.M_ID
	 * @return  the value of courses.M_ID
	 * @mbg.generated  Sun Jul 08 23:52:53 CST 2018
	 */
	public Integer getM_ID() {
		return M_ID;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column courses.M_ID
	 * @param M_ID  the value for courses.M_ID
	 * @mbg.generated  Sun Jul 08 23:52:53 CST 2018
	 */
	public void setM_ID(Integer M_ID) {
		this.M_ID = M_ID;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column courses.CO_name
	 * @return  the value of courses.CO_name
	 * @mbg.generated  Sun Jul 08 23:52:53 CST 2018
	 */
	public String getCO_name() {
		return CO_name;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column courses.CO_name
	 * @param CO_name  the value for courses.CO_name
	 * @mbg.generated  Sun Jul 08 23:52:53 CST 2018
	 */
	public void setCO_name(String CO_name) {
		this.CO_name = CO_name == null ? null : CO_name.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column courses.CO_introduction
	 * @return  the value of courses.CO_introduction
	 * @mbg.generated  Sun Jul 08 23:52:53 CST 2018
	 */
	public String getCO_introduction() {
		return CO_introduction;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column courses.CO_introduction
	 * @param CO_introduction  the value for courses.CO_introduction
	 * @mbg.generated  Sun Jul 08 23:52:53 CST 2018
	 */
	public void setCO_introduction(String CO_introduction) {
		this.CO_introduction = CO_introduction == null ? null : CO_introduction.trim();
	}
}