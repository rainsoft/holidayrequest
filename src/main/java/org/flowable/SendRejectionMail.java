/**
 * SendRejectionMail.java Apr 14, 2018
 */
package org.flowable;

import org.flowable.engine.delegate.DelegateExecution;
import org.flowable.engine.delegate.JavaDelegate;

/**
 * <p>
 * <b>SendRejectionMail</b> is
 * </p>
 *
 * @since Apr 14, 2018
 * @author Rain
 * @version $Id$
 */
public class SendRejectionMail implements JavaDelegate {

    public void execute(DelegateExecution execution) {
        System.out.println("SendRejectionMail "
            + execution.getVariable("employee"));
    }
}
