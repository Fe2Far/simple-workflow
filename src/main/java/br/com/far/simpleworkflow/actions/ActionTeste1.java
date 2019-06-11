package br.com.far.simpleworkflow.actions;


import br.com.far.simpleworkflow.interfaces.Context;
import br.com.far.simpleworkflow.interfaces.WorkflowAction;

public class ActionTeste1 implements WorkflowAction {

	public void doAction(Context context) throws Exception {
		System.out.println("Validando se o Número é par : " + context.getAttribute("param1"));
		int n = Integer.parseInt(context.getAttribute("param1").toString());
		context.setAttribute("numeroPar", n % 2 == 0);
	}

}
