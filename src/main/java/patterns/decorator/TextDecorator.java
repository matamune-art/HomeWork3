package decorator;

public abstract class TextDecorator implements Text {
    protected Text wrappedText;

    public TextDecorator(Text wrappedText) {
        this.wrappedText = wrappedText;
    }

    @Override
    public String getContent() {
        return wrappedText.getContent();
    }
}
