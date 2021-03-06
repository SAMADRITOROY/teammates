package teammates.test.cases.newaction;

import org.testng.annotations.Test;

import teammates.common.util.Const;
import teammates.ui.newcontroller.DeleteAccountAction;

/**
 * SUT: {@link DeleteAccountAction}.
 */
public class DeleteAccountActionTest extends BaseActionTest<DeleteAccountAction> {

    @Override
    protected String getActionUri() {
        return Const.ResourceURIs.ACCOUNTS;
    }

    @Override
    protected String getRequestMethod() {
        return DELETE;
    }

    @Override
    @Test
    protected void testExecute() {
        // TODO
    }

    @Override
    @Test
    protected void testAccessControl() {
        verifyOnlyAdminCanAccess();
    }

}
