package choral.examples.superselect;

import choral.channels.DiSuperSelectChannel_B;
import choral.lang.Unit;
import choral.channels.DiSelectChannel_B;

public class SuperSelect_B {
	public SuperSelect_B( DiSelectChannel_B che, DiSuperSelectChannel_B < SuperSelectBool > ch ) {
		{
			switch( che.< SuperSelectEnum >select( Unit.id ) ){
				case TRUE -> {
					int x = 7;
				}
				case FALSE -> {
					double x = 7.0;
				}
				default -> {
					throw new RuntimeException( "Received unexpected label from select operation" );
				}
			}
		}
	}

}
