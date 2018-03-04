package com.example.examplestatemachine;

public class RejectState extends State {

	StateContext theContext;
	
	public RejectState (StateContext theContext) {
		this.theContext = theContext;
		this.accept = false;
	}
	@Override
	public void actionA() {
		if (theContext.isFirstAction() == theContext.isCurrentAction()) {
			System.out.println("Reject --> Accept");
			theContext.setState(theContext.getAcceptState());
		} else {
			System.out.println("Reject --> Reject");
		}
	}
	@Override
	public void actionB() {
		if (theContext.isFirstAction() == theContext.isCurrentAction()) {
			System.out.println("Reject --> Accept");
			theContext.setState(theContext.getAcceptState());
		} else {
			System.out.println("Reject --> Reject");
		}
	}
}
