package me.jonakls.api.components;

public class TitleModel {

    private final String title;
    private final String subTitle;
    private final int fadeIn;
    private final int stay;
    private final int fadeOut;

    /**
     * Generates the title in its entirety, with title, subtitle and time.
     * @param title Title that show in screen
     * @param subTitle SubTitle that show in screen
     * @param fadeIn Time it will take for titles to appear on screen
     * @param stay Time in which the titles will be constantly on screen
     * @param fadeOut Time it takes for titles to disappear from screen
     */
    public TitleModel(String title, String subTitle, int fadeIn, int stay, int fadeOut) {
        this.title = title;
        this.subTitle = subTitle;
        this.fadeIn = fadeIn;
        this.stay = stay;
        this.fadeOut = fadeOut;
    }

    /**
     * Generates the title in its entirety, with title and subtitle.
     * @param title Title that show in screen
     * @param subTitle SubTitle that show in screen
     */
    public TitleModel(String title, String subTitle) {
        this.title = title;
        this.subTitle = subTitle;
        this.fadeIn = 0;
        this.stay = 5;
        this.fadeOut = 0;
    }

    /**
     * @return Return title text
     */
    public String getTitle() {
        return title;
    }

    /**
     * @return Return subtitle text
     */
    public String getSubTitle() {
        return subTitle;
    }

    /**
     * @return Return time fade in value
     */
    public int getFadeIn() {
        return fadeIn;
    }

    /**
     * @return Return time to stay value
     */
    public int getStay() {
        return stay;
    }

    /**
     * @return Return time fade out value
     */
    public int getFadeOut() {
        return fadeOut;
    }
}
