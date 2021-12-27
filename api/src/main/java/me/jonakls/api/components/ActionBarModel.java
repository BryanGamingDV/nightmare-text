package me.jonakls.api.components;

public class ActionBarModel {

    private final String actionBar;

    /**
     * Generate action bar
     * @param actionBar Text that show in action bar
     */
    public ActionBarModel(String actionBar) {
        this.actionBar = actionBar;
    }

    /**
     * @return Returns action bar text
     */
    public String getActionBar() {
        return actionBar;
    }
}
