package br.com.far.simpleworkflow.actions;

import br.com.far.simpleworkflow.interfaces.Context;
import br.com.far.simpleworkflow.interfaces.WorkflowAction;

public class ActionTeste2 implements WorkflowAction {

	public void doAction(Context context) throws Exception {
		boolean numeroPar = Boolean.parseBoolean(context.getAttribute("numeroPar").toString());
		if(numeroPar){
			System.out.println("este número é par");
		} else {
			System.out.println("este número é impar");
		}
	}

}
