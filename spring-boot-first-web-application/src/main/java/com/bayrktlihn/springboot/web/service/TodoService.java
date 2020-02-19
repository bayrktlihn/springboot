package com.bayrktlihn.springboot.web.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.bayrktlihn.springboot.web.model.Todo;

@Service
public class TodoService {
	private static List<Todo> todos = new ArrayList<Todo>();
	private static int todoCount = 0;

	static {
		todos.add(new Todo(++todoCount, "bayrktlihn", "Learn Spring MVC", new Date(), false));
		todos.add(new Todo(++todoCount, "bayrktlihn", "Learn Struts", new Date(), false));
		todos.add(new Todo(++todoCount, "bayrktlihn", "Learn Hibernate", new Date(), false));
		
	}
	
	public List<Todo> retrieveTodos(String user){
		return todos.parallelStream().filter(x -> x.getUser().equals(user)).collect(Collectors.toList());
	}
	
	public Todo retrieveTodo(int id) {
		for(Todo todo : todos) {
			if(todo.getId() == id)
				return todo;
		}
		return null;
	}
	
	public void addTodo(Todo todo) {
		todo.setId(++todoCount);
		todos.add(todo);
	}
	
	public void updateTodo(Todo todo) {
		Todo tmpTodo = null;
		
		for(Todo varTodo : todos) {
			if(varTodo.getId() == todo.getId()) {
				tmpTodo = varTodo;
			}
		}
		
		if(tmpTodo != null) {
			tmpTodo.setDesc(todo.getDesc());
			tmpTodo.setId(todo.getId());
			tmpTodo.setUser(todo.getUser());
			tmpTodo.setTargetDate(todo.getTargetDate());
		}
	}
	
	public void deleteTodo(int id) {
		todos.removeIf(x -> x.getId() == id);
	}
	
	

}
