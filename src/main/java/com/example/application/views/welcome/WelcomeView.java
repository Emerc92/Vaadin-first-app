package com.example.application.views.welcome;

import com.example.application.views.MainLayout;
import com.vaadin.flow.component.Key;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.RouteAlias;

@PageTitle("Welcome")
@Route(value = "welcome", layout = MainLayout.class)
@RouteAlias(value = "", layout = MainLayout.class)
public class WelcomeView extends HorizontalLayout {

    private TextField name;
    private Button sayHello;
    private Button login;
    private Button signIn;

    public WelcomeView() {
        signIn = new Button("Sign In");
        login = new Button("Login");

        /*
        name = new TextField("Register your name");
        sayHello = new Button("Say hello");
        sayHello.addClickListener(e -> {
            name.getValue();
            Notification.show("Hello, " + (name.getValue()==null || name.getValue().isBlank() ?"stranger": name.getValue()));
        });
        sayHello.addClickShortcut(Key.ENTER);

        setMargin(true);
        setVerticalComponentAlignment(Alignment.END, name, sayHello);

        add(name, sayHello);
        */

    }

}
