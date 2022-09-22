package choral.examples.superselect;

import choral.channels.DiSelectChannel_A;
import choral.channels.DiSuperSelectChannel_A;

public class SuperSelect_A {
	public SuperSelect_A( DiSelectChannel_A che, DiSuperSelectChannel_A < SuperSelectBool > ch ) {
		if( true ){
			ch.< SuperSelectTrue >select( new SuperSelectTrue() );
		} else { 
			ch.< SuperSelectFalse >select( new SuperSelectFalse() );
		}
	}

}
