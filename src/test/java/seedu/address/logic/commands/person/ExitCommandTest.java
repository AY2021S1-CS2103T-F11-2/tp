package seedu.address.logic.commands.person;

import static seedu.address.logic.commands.person.CommandTestUtil.assertCommandSuccess;
import static seedu.address.logic.commands.person.ExitCommand.MESSAGE_EXIT_ACKNOWLEDGEMENT;

import org.junit.jupiter.api.Test;

import seedu.address.logic.commands.CommandResult;
import seedu.address.model.ModelPerson;
import seedu.address.model.ModelPersonManager;

public class ExitCommandTest {
    private ModelPerson modelPerson = new ModelPersonManager();
    private ModelPerson expectedModelPerson = new ModelPersonManager();

    @Test
    public void execute_exit_success() {
        CommandResult expectedCommandResult = new CommandResult(MESSAGE_EXIT_ACKNOWLEDGEMENT, false, true);
        assertCommandSuccess(new ExitCommand(), modelPerson, expectedCommandResult, expectedModelPerson);
    }
}
