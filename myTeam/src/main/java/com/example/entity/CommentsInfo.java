package com.example.entity;

public class CommentsInfo {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column comments.COM_ID
	 * @mbg.generated  Sun Jul 08 23:52:53 CST 2018
	 */
	private String COM_ID;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column comments.L_ID
	 * @mbg.generated  Sun Jul 08 23:52:53 CST 2018
	 */
	private Integer L_ID;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column comments.ID
	 * @mbg.generated  Sun Jul 08 23:52:53 CST 2018
	 */
	private String ID;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column comments.COM_information
	 * @mbg.generated  Sun Jul 08 23:52:53 CST 2018
	 */
	private String COM_information;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column comments.COM_time
	 * @mbg.generated  Sun Jul 08 23:52:53 CST 2018
	 */
	private Long COM_time;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column comments.COM_ID
	 * @return  the value of comments.COM_ID
	 * @mbg.generated  Sun Jul 08 23:52:53 CST 2018
	 */
	public String getCOM_ID() {
		return COM_ID;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column comments.COM_ID
	 * @param COM_ID  the value for comments.COM_ID
	 * @mbg.generated  Sun Jul 08 23:52:53 CST 2018
	 */
	public void setCOM_ID(String COM_ID) {
		this.COM_ID = COM_ID == null ? null : COM_ID.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column comments.L_ID
	 * @return  the value of comments.L_ID
	 * @mbg.generated  Sun Jul 08 23:52:53 CST 2018
	 */
	public Integer getL_ID() {
		return L_ID;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column comments.L_ID
	 * @param L_ID  the value for comments.L_ID
	 * @mbg.generated  Sun Jul 08 23:52:53 CST 2018
	 */
	public void setL_ID(Integer L_ID) {
		this.L_ID = L_ID;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column comments.ID
	 * @return  the value of comments.ID
	 * @mbg.generated  Sun Jul 08 23:52:53 CST 2018
	 */
	public String getID() {
		return ID;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column comments.ID
	 * @param ID  the value for comments.ID
	 * @mbg.generated  Sun Jul 08 23:52:53 CST 2018
	 */
	public void setID(String ID) {
		this.ID = ID == null ? null : ID.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column comments.COM_information
	 * @return  the value of comments.COM_information
	 * @mbg.generated  Sun Jul 08 23:52:53 CST 2018
	 */
	public String getCOM_information() {
		return COM_information;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column comments.COM_information
	 * @param COM_information  the value for comments.COM_information
	 * @mbg.generated  Sun Jul 08 23:52:53 CST 2018
	 */
	public void setCOM_information(String COM_information) {
		this.COM_information = COM_information == null ? null : COM_information.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column comments.COM_time
	 * @return  the value of comments.COM_time
	 * @mbg.generated  Sun Jul 08 23:52:53 CST 2018
	 */
	public Long getCOM_time() {
		return COM_time;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column comments.COM_time
	 * @param COM_time  the value for comments.COM_time
	 * @mbg.generated  Sun Jul 08 23:52:53 CST 2018
	 */
	public void setCOM_time(Long COM_time) {
		this.COM_time = COM_time;
	}
}