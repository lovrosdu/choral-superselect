package choral.examples.superselect;

import choral.channels.DiSelectChannel_B;
import choral.channels.DiSuperSelectChannel_B;
import choral.lang.Unit;

public class SuperSelect_B {
	public SuperSelect_B( DiSelectChannel_B che, DiSuperSelectChannel_B < SuperSelectBool > ch ) {
		{
			switch( ch.< SuperSelectTrue >select( Unit.id ) ){
				default -> {
					throw new RuntimeException( "Received unexpected label from select operation" );
				}
				case SuperSelectFalse l2 -> {
					double x = 7.0;
				}
				case SuperSelectTrue l1 -> {
					int x = 7;
				}
			}
		}
	}

}
