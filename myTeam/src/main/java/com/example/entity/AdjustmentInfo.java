package com.example.entity;

public class AdjustmentInfo {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column adjustment.AD_ID
	 * @mbg.generated  Sun Jul 08 23:52:53 CST 2018
	 */
	private Integer AD_ID;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column adjustment.ID
	 * @mbg.generated  Sun Jul 08 23:52:53 CST 2018
	 */
	private String ID;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column adjustment.STU_ID
	 * @mbg.generated  Sun Jul 08 23:52:53 CST 2018
	 */
	private String STU_ID;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column adjustment.AD_time
	 * @mbg.generated  Sun Jul 08 23:52:53 CST 2018
	 */
	private Long AD_time;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column adjustment.AD_introduction
	 * @mbg.generated  Sun Jul 08 23:52:53 CST 2018
	 */
	private String AD_introduction;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column adjustment.AD_ID
	 * @return  the value of adjustment.AD_ID
	 * @mbg.generated  Sun Jul 08 23:52:53 CST 2018
	 */
	public Integer getAD_ID() {
		return AD_ID;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column adjustment.AD_ID
	 * @param AD_ID  the value for adjustment.AD_ID
	 * @mbg.generated  Sun Jul 08 23:52:53 CST 2018
	 */
	public void setAD_ID(Integer AD_ID) {
		this.AD_ID = AD_ID;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column adjustment.ID
	 * @return  the value of adjustment.ID
	 * @mbg.generated  Sun Jul 08 23:52:53 CST 2018
	 */
	public String getID() {
		return ID;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column adjustment.ID
	 * @param ID  the value for adjustment.ID
	 * @mbg.generated  Sun Jul 08 23:52:53 CST 2018
	 */
	public void setID(String ID) {
		this.ID = ID == null ? null : ID.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column adjustment.STU_ID
	 * @return  the value of adjustment.STU_ID
	 * @mbg.generated  Sun Jul 08 23:52:53 CST 2018
	 */
	public String getSTU_ID() {
		return STU_ID;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column adjustment.STU_ID
	 * @param STU_ID  the value for adjustment.STU_ID
	 * @mbg.generated  Sun Jul 08 23:52:53 CST 2018
	 */
	public void setSTU_ID(String STU_ID) {
		this.STU_ID = STU_ID == null ? null : STU_ID.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column adjustment.AD_time
	 * @return  the value of adjustment.AD_time
	 * @mbg.generated  Sun Jul 08 23:52:53 CST 2018
	 */
	public Long getAD_time() {
		return AD_time;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column adjustment.AD_time
	 * @param AD_time  the value for adjustment.AD_time
	 * @mbg.generated  Sun Jul 08 23:52:53 CST 2018
	 */
	public void setAD_time(Long AD_time) {
		this.AD_time = AD_time;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column adjustment.AD_introduction
	 * @return  the value of adjustment.AD_introduction
	 * @mbg.generated  Sun Jul 08 23:52:53 CST 2018
	 */
	public String getAD_introduction() {
		return AD_introduction;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column adjustment.AD_introduction
	 * @param AD_introduction  the value for adjustment.AD_introduction
	 * @mbg.generated  Sun Jul 08 23:52:53 CST 2018
	 */
	public void setAD_introduction(String AD_introduction) {
		this.AD_introduction = AD_introduction == null ? null : AD_introduction.trim();
	}
}