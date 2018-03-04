package com.example.examplestatemachine;

public class StateContext {
	State acceptState;
	State rejectState;
	State s;
	boolean isFirstAction;
	boolean firstAction; //if actionA, then true; if actionB, then false;
	boolean currentAction; 
	
	
	public StateContext() {
		this.rejectState = new RejectState(this);
		this.acceptState = new AcceptState(this);
		s = rejectState;
		isFirstAction = true;
	}
	
	public boolean isFirstAction() {
		return firstAction;
	}

	public void setFirstAction(boolean firstAction) {
		this.firstAction = firstAction;
	}

	public void actionA() {
		if (isFirstAction) {
			firstAction = true;
			isFirstAction = false;
		}
		currentAction = true;
		s.actionA();
	}
	
	public void actionB() {
		if (isFirstAction) {
			firstAction = false;
			isFirstAction = false;
		}
		currentAction = false;
		s.actionB();
	}

	public boolean isCurrentAction() {
		return currentAction;
	}

	public void setCurrentAction(boolean currentAction) {
		this.currentAction = currentAction;
	}

	public State getAcceptState() {
		// TODO Auto-generated method stub
		return acceptState;
	}
	public State getRejectState() {
		// TODO Auto-generated method stub
		return rejectState;
	}

	public void setState(State acceptState2) {
		// TODO Auto-generated method stub
		s = acceptState2;
	}
	
	public boolean isAccept() {
        return s.isAccept();
    }
}
