package org.zerock.domain;

import java.util.Date;

import lombok.Data;

@Data
public class BoardVO {
	private long bno;
	private String title;
	private String Content;
	private String writer;
	private Date regdate;
	private Date updateDate;
}
