package com.example.examplestatemachine;

public class AcceptState extends State {
	
	StateContext theContext;
	
	public AcceptState (StateContext theContext) {
		this.theContext = theContext;
		this.accept = true;
	}
	@Override
	public void actionA() {
		if (theContext.isFirstAction() != theContext.isCurrentAction()) {
			System.out.println("Accept --> Reject");
			theContext.setState(theContext.getRejectState());
		} else {
			System.out.println("Accept --> Accept");
		}
	}
	@Override
	public void actionB() {
		if (theContext.isFirstAction() != theContext.isCurrentAction()) {
			System.out.println("Accept --> Reject");
			theContext.setState(theContext.getRejectState());
		} else {
			System.out.println("Accept --> Accept");
		}	
	}
}
