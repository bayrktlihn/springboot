package com.bayrktlihn.springboot.model;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Survey {
	private String id;
	private String title;
	private String description;
	private List<Question> questions;
}
