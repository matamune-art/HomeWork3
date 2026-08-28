package decorator;

public class BoldDecorator extends TextDecorator {
    public BoldDecorator(Text wrappedText) {
        super(wrappedText);
    }

    @Override
    public String getContent() {
        return "<b>" + super.getContent() + "</b>";
    }
}