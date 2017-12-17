package org.idsoy.test.poi;

import java.io.Serializable;
import java.math.BigDecimal;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * 成绩单实体
 * Created on 2017年12月17日.
 *
 * @version 1.0.0
 * @author idsoy
 */
public class SchoolReport implements Serializable{

	private static final long serialVersionUID = 663434581303435606L;
	
	/** 学号 */
	@ExcelCell(value = 0, require = true)
	private Long studentNo;
	
	/** 姓名 */
	@ExcelCell(1)
	private String userName;
	
	/** 语文成绩 */
	@ExcelCell(2)
	private Integer chinese;
	
	/** 数学成绩 */
	@ExcelCell(3)
	private Integer math;
	
	/** 英语成绩 */
	@ExcelCell(4)
	private Integer english;
	
	/** 美术成绩 */
	@ExcelCell(5)
	private Integer art;
	
	/** 体育成绩 */
	@ExcelCell(6)
	private Integer pe;
	
	/** 平均成绩 */
	@ExcelCell(7)
	private BigDecimal gpa;

	public Long getStudentNo() {
		return studentNo;
	}

	public void setStudentNo(Long studentNo) {
		this.studentNo = studentNo;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Integer getChinese() {
		return chinese;
	}

	public void setChinese(Integer chinese) {
		this.chinese = chinese;
	}

	public Integer getMath() {
		return math;
	}

	public void setMath(Integer math) {
		this.math = math;
	}

	public Integer getEnglish() {
		return english;
	}

	public void setEnglish(Integer english) {
		this.english = english;
	}

	public Integer getArt() {
		return art;
	}

	public void setArt(Integer art) {
		this.art = art;
	}

	public Integer getPe() {
		return pe;
	}

	public void setPe(Integer pe) {
		this.pe = pe;
	}

	public BigDecimal getGpa() {
		return gpa;
	}

	public void setGpa(BigDecimal gpa) {
		this.gpa = gpa;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);
	}

}
