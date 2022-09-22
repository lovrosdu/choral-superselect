package choral.examples.superselect;

import choral.channels.DiSuperSelectChannel_A;
import choral.channels.DiSelectChannel_A;

public class SuperSelect_A {
	public SuperSelect_A( DiSelectChannel_A che, DiSuperSelectChannel_A < SuperSelectBool > ch ) {
		if( true ){
			che.< SuperSelectEnum >select( SuperSelectEnum.TRUE );
		} else { 
			che.< SuperSelectEnum >select( SuperSelectEnum.FALSE );
		}
	}

}
