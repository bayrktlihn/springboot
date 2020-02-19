package com.bayrktlihn.springboot.web.model;

import java.util.Date;

import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Todo {
	private int id;
	private String user;
	
	@Size(min = 10, message = "Enter atleast 10 Characters...")
	private String desc;
	private Date targetDate;
	private boolean isDone;

	public Todo(String user, String desc, Date targetDate, boolean isDone) {
		this.user = user;
		this.desc = desc;
		this.targetDate = targetDate;
		this.isDone = isDone;
	}

}
