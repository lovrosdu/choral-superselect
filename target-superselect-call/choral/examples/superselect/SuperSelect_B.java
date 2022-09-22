package choral.examples.superselect;

import choral.channels.DiSuperSelectChannel_B;
import choral.lang.Unit;
import choral.channels.DiSelectChannel_B;

public class SuperSelect_B {
	public SuperSelect_B( DiSelectChannel_B che, DiSuperSelectChannel_B < SuperSelectBool > ch ) {
		{
			switch( ch.< SuperSelectTrue >select( Unit.id ) ){
				case SuperSelectTrue __unusedVar__ -> {
					int x = 7;
				}
				default -> {
					throw new RuntimeException( "Received unexpected label from select operation" );
				}
				case SuperSelectFalse __unusedVar__ -> {
					double x = 7.0;
				}
			}
		}
	}

}
