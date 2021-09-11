package net.zxx.template;

public class Main {
    public static void main(String[] args) {
        AbstractProjectManager payProjectManager = new PayServiceProjectManager();
        payProjectManager.processProject();

        AbstractProjectManager userProjectManager = new PayServiceProjectManager();
        userProjectManager.processProject();
    }
}
