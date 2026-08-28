package decorator;

public class DecoratorDemo {
    public void run() {
        Text text = new SimpleText("Привет, мир!");

        Text boldText = new BoldDecorator(text);
        Text italicBoldText = new ItalicDecorator(boldText);

        System.out.println(text.getContent());
        System.out.println(boldText.getContent());
        System.out.println(italicBoldText.getContent());
    }
}