package seedu.address.logic.commands.person;

import static seedu.address.logic.commands.person.CommandTestUtil.assertCommandSuccess;
import static seedu.address.logic.commands.person.CommandTestUtil.showPersonAtIndex;
import static seedu.address.testutil.TypicalIndexes.INDEX_FIRST_PERSON;
import static seedu.address.testutil.TypicalPersons.getTypicalAddressBook;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import seedu.address.model.ModelPerson;
import seedu.address.model.ModelPersonManager;
import seedu.address.model.person.UserPrefs;

/**
 * Contains integration tests (interaction with the Model) and unit tests for ListCommand.
 */
public class ListCommandTest {

    private ModelPerson modelPerson;
    private ModelPerson expectedModelPerson;

    @BeforeEach
    public void setUp() {
        modelPerson = new ModelPersonManager(getTypicalAddressBook(), new UserPrefs());
        expectedModelPerson = new ModelPersonManager(modelPerson.getAddressBook(), new UserPrefs());
    }

    @Test
    public void execute_listIsNotFiltered_showsSameList() {
        assertCommandSuccess(new ListCommand(), modelPerson, ListCommand.MESSAGE_SUCCESS, expectedModelPerson);
    }

    @Test
    public void execute_listIsFiltered_showsEverything() {
        showPersonAtIndex(modelPerson, INDEX_FIRST_PERSON);
        assertCommandSuccess(new ListCommand(), modelPerson, ListCommand.MESSAGE_SUCCESS, expectedModelPerson);
    }
}
