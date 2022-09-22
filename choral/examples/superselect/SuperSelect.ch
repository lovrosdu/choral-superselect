package choral.examples.superselect;

import choral.channels.DiSuperSelectChannel;
import choral.channels.DiSelectChannel;

public class SuperSelect@(A, B) {
    public SuperSelect(DiSelectChannel@(A, B) che,
                       DiSuperSelectChannel@(A, B)<SuperSelectBool> ch) {
        if (true@A) {
            // che.<SuperSelectEnum>select(SuperSelectEnum@A.TRUE);
            // ch.<SuperSelectTrue>select(new SuperSelectTrue@A());
            SuperSelectTrue@B l1 = ch.<SuperSelectTrue>select(new SuperSelectTrue@A());

            // System.out.println("true"@B);
            int@B x = 7@B;
        }
        else {
            // che.<SuperSelectEnum>select(SuperSelectEnum@A.FALSE);
            // ch.<SuperSelectFalse>select(new SuperSelectFalse@A());
            SuperSelectFalse@B l2 = ch.<SuperSelectFalse>select(new SuperSelectFalse@A());

            // System.out.println("false"@B);
            double@B x = 7.0@B;
        }
    }
}
