package com.example.entity;

public class ModuleInfo {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column module.M_ID
	 * @mbg.generated  Sun Jul 08 23:52:53 CST 2018
	 */
	private Integer M_ID;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column module.M_name
	 * @mbg.generated  Sun Jul 08 23:52:53 CST 2018
	 */
	private String M_name;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column module.M_ID
	 * @return  the value of module.M_ID
	 * @mbg.generated  Sun Jul 08 23:52:53 CST 2018
	 */
	public Integer getM_ID() {
		return M_ID;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column module.M_ID
	 * @param M_ID  the value for module.M_ID
	 * @mbg.generated  Sun Jul 08 23:52:53 CST 2018
	 */
	public void setM_ID(Integer M_ID) {
		this.M_ID = M_ID;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column module.M_name
	 * @return  the value of module.M_name
	 * @mbg.generated  Sun Jul 08 23:52:53 CST 2018
	 */
	public String getM_name() {
		return M_name;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column module.M_name
	 * @param M_name  the value for module.M_name
	 * @mbg.generated  Sun Jul 08 23:52:53 CST 2018
	 */
	public void setM_name(String M_name) {
		this.M_name = M_name == null ? null : M_name.trim();
	}
}