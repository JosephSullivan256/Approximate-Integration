package com.youknowjoejoe.gmail.approxint;

public class ApproximateIntegral {
	
	private double a, b;
	private int n;
	private Function f;
	
	public ApproximateIntegral(double a, double b, int n, Function f) {
		this.a = a;
		this.b = b;
		this.n = n;
		this.f = f;
	}
	
	public double subInterval(int i) {
		return ((double) i)*getDX() + a;
	}
	
	public int getN() {
		return n;
	}
	
	public double getDX() {
		return (b-a)/((double) n);
	}
	
	public Function getFunction() {
		return f;
	}
	
	public double evaluate(IntegrationMethod m) {
		return m.integrate(this);
	}
}
