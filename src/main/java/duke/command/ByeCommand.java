package duke.command;

import duke.main.Storage;
import duke.main.TaskList;
import duke.main.Ui;

/**
 * The ByeCommand class.
 */
public class ByeCommand extends Command {
    /**
     * Displays a goodbye message to the ui.
     */
    @Override
    public String execute(TaskList taskList, Ui ui, Storage storage) {
        return ui.showGoodbyeMsg();
    }

    @Override
    public boolean isExit() {
        return true;
    }
}
