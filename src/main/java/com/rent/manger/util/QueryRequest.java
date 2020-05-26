package com.rent.manger.util;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * @author tunkech
 */
@Setter
@Getter
public class QueryRequest implements Serializable {

	private static final long serialVersionUID = -4869594085374385813L;

	/**每页显示多少条数*/
	private Integer pageSize = 10;
	/**当前页码*/
	private Integer pageNum = 1;
	/**排序字段*/
	private String orderBy;
	/**降序 */
	private String desc;

	private String token;


}
