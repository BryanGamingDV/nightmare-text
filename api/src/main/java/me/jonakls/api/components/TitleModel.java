package me.jonakls.api.components;

public class TitleModel {

    private final String title;
    private final String subTitle;
    private final int fadeIn;
    private final int stay;
    private final int fadeOut;

    public TitleModel(String title, String subTitle, int fadeIn, int stay, int fadeOut) {
        this.title = title;
        this.subTitle = subTitle;
        this.fadeIn = fadeIn;
        this.stay = stay;
        this.fadeOut = fadeOut;
    }

    public TitleModel(String title, String subTitle) {
        this.title = title;
        this.subTitle = subTitle;
        this.fadeIn = 0;
        this.stay = 5;
        this.fadeOut = 0;
    }

    public String getTitle() {
        return title;
    }

    public String getSubTitle() {
        return subTitle;
    }

    public int getFadeIn() {
        return fadeIn;
    }

    public int getStay() {
        return stay;
    }

    public int getFadeOut() {
        return fadeOut;
    }
}
