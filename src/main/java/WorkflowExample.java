import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import br.com.far.simpleworkflow.actions.ActionTeste1;
import br.com.far.simpleworkflow.actions.ActionTeste2;
import br.com.far.simpleworkflow.actions.ActionTeste3;
import br.com.far.simpleworkflow.implementation.StandardWorkflow;
import br.com.far.simpleworkflow.interfaces.WorkflowAction;

public class WorkflowExample {
	
	private static final String ACTION = "teste";

	public static void main(String[] args) {

		List<WorkflowAction> listActions = new ArrayList<WorkflowAction>();
		ActionTeste1 act1 = new ActionTeste1();
		ActionTeste2 act2 = new ActionTeste2();
		ActionTeste3 act3 = new ActionTeste3();
		listActions.addAll(Arrays.asList(act1,act2,act3));

		Map<String,List<WorkflowAction>> mapActions = new HashMap<String,List<WorkflowAction>>();
		mapActions.put(ACTION, listActions);

		StandardWorkflow stdWorkflow = new StandardWorkflow();
		stdWorkflow.setWorkflowActions(mapActions);

		Map<String, Object> parameters = new HashMap<String,Object>();
		parameters.put("param1", "4");
		
		stdWorkflow.processWorkflow(ACTION, parameters);
		
	}

}
