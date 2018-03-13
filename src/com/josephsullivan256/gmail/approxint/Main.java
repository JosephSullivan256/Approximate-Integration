package com.josephsullivan256.gmail.approxint;

public class Main {

	public static void main(String[] args) {
		Function f = (x)->x*x*x*x;
		double a = 0;
		double b = 2;
		int n = 10;
		
		ApproximateIntegral integral = new ApproximateIntegral(a,b,n,f);
		
		double r = integral.evaluate(IntegrationMethod.r);
		System.out.println("Right Endpoints: " + r);
		double l = integral.evaluate(IntegrationMethod.l);
		System.out.println("Left  Endpoints: " + l);
		double t = integral.evaluate(IntegrationMethod.t);
		System.out.println("Trapezoid  Rule: " + t);
		double m = integral.evaluate(IntegrationMethod.m);
		System.out.println("Midpoint   Rule: " + m);
		double s = integral.evaluate(IntegrationMethod.s);
		System.out.println("Simpson's  Rule: " + s);
		
		System.out.println();
		
		double value = 32.0/5.0;
		
		System.out.println("Er :" + (value-r));
		System.out.println("El :" + (value-l));
		System.out.println("Et :" + (value-t));
		System.out.println("Em :" + (value-m));
		System.out.println("Es :" + (value-s));
	}

}
