package decorator;

public class ItalicDecorator extends TextDecorator {
    public ItalicDecorator(Text wrappedText) {
        super(wrappedText);
    }

    @Override
    public String getContent() {
        return "<i>" + super.getContent() + "</i>";
    }
}