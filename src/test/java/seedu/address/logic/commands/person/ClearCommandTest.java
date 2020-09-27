package seedu.address.logic.commands.person;

import static seedu.address.logic.commands.person.CommandTestUtil.assertCommandSuccess;
import static seedu.address.testutil.TypicalPersons.getTypicalAddressBook;

import org.junit.jupiter.api.Test;

import seedu.address.model.ModelPerson;
import seedu.address.model.ModelPersonManager;
import seedu.address.model.person.AddressBook;
import seedu.address.model.person.UserPrefs;

public class ClearCommandTest {

    @Test
    public void execute_emptyAddressBook_success() {
        ModelPerson modelPerson = new ModelPersonManager();
        ModelPerson expectedModelPerson = new ModelPersonManager();

        assertCommandSuccess(new ClearCommand(), modelPerson, ClearCommand.MESSAGE_SUCCESS, expectedModelPerson);
    }

    @Test
    public void execute_nonEmptyAddressBook_success() {
        ModelPerson modelPerson = new ModelPersonManager(getTypicalAddressBook(), new UserPrefs());
        ModelPerson expectedModelPerson = new ModelPersonManager(getTypicalAddressBook(), new UserPrefs());
        expectedModelPerson.setAddressBook(new AddressBook());

        assertCommandSuccess(new ClearCommand(), modelPerson, ClearCommand.MESSAGE_SUCCESS, expectedModelPerson);
    }

}
