package br.com.far.simpleworkflow.actions;

import br.com.far.simpleworkflow.interfaces.Context;
import br.com.far.simpleworkflow.interfaces.WorkflowAction;

public class ActionTeste3 implements WorkflowAction {

	public void doAction(Context context) throws Exception {
		System.out.println("Inserindo registro na tabela de Log");
	}

}
