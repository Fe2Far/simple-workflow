package br.com.far.simpleworkflow.interfaces;

public interface Context {

	public void setAttribute(String name, Object value);

	public Object getAttribute(String name);

}
