package br.com.far.simpleworkflow.implementation;

import java.util.HashMap;
import java.util.Map;

import br.com.far.simpleworkflow.interfaces.Context;

public class StandardContext implements Context {
	
	private Map<String, Object> context;
	
	public StandardContext(Map<String, Object> parameters) {
		if (parameters == null) {
			this.context = new HashMap<String, Object>();
		} else {
			this.context = parameters;
		}
	}
	
	public Object getAttribute(String name) {
		return context.get(name);
	}
	 
	public void setAttribute(String name, Object value) {
		context.put(name, value);
	}

}
