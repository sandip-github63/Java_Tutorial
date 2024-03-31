package com.test;

/**
 * @author sandip
 *
 */
public class CurrencyValidator extends AbstractValidator {
	
	private static CurrencyValidator instance;
	
	private CurrencyValidator() {
		
	}
	
	
	/* singleton object is created */
	
	public static CurrencyValidator getInstance(){
		if(CurrencyValidator.instance==null) {
			synchronized (CurrencyValidator.class) {
				if(CurrencyValidator.instance==null) {
					CurrencyValidator.instance=new CurrencyValidator();
				}
			}
		}
		return CurrencyValidator.instance;
	}

}
