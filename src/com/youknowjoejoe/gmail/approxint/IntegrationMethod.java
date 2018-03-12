package com.youknowjoejoe.gmail.approxint;

public interface IntegrationMethod {
	public double integrate(ApproximateIntegral integral);
	
	public static final IntegrationMethod r = (integral)->{
		double value = 0.0;
		
		for(int i = 1; i <= integral.getN(); i++) {
			value+=integral.getDX()*integral.getFunction().of(integral.subInterval(i));
		}
		return value;
	};
	
	public static final IntegrationMethod l = (integral)->{
		double value = 0.0;
		
		for(int i = 0; i < integral.getN(); i++) {
			value+=integral.getDX()*integral.getFunction().of(integral.subInterval(i));
		}
		return value;
	};
	
	public static final IntegrationMethod m = (integral)->{
		double value = 0.0;
		
		for(int i = 1; i <= integral.getN(); i++) {
			value+=integral.getDX()*integral.getFunction().of((integral.subInterval(i-1)+integral.subInterval(i))/2.0);
		}
		return value;
	};
	
	public static final IntegrationMethod t = (integral)->{
		double value = 0.0;
		
		for(int i = 1; i <= integral.getN(); i++) {
			value+=integral.getDX()*(integral.getFunction().of(integral.subInterval(i-1))+integral.getFunction().of(integral.subInterval(i)))/2.0;
		}
		return value;
	};
	
	public static final IntegrationMethod s = (integral)->{
		double value = 0.0;
		
		for(int i = 0; i < integral.getN(); i+=2) {
			value+=integral.getDX()*(integral.getFunction().of(integral.subInterval(i))+4*integral.getFunction().of(integral.subInterval(i+1))+integral.getFunction().of(integral.subInterval(i+2)))/3.0;
		}
		return value;
	};
}
