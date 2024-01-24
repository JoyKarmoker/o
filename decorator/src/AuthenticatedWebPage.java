public class AuthenticatedWebPage extends WebPageDecorator {
    public AuthenticatedWebPage(WebPage decoratedWebPage) {
        super(decoratedWebPage);
    }

    private void authenticateUser() {
        System.out.println("Authenticating user");
    }

    @Override
    public void display() {
        authenticateUser();
        super.display();
    }
}