package com.example.application.views.shopping;

import com.example.application.views.MainLayout;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

@PageTitle("Start Shopping")
@Route(value = "startShopping", layout = MainLayout.class)
public class StartShopping extends VerticalLayout {

    public StartShopping(){
        setSpacing(false);
        //Image img = new Image("images/shopping.png", "Start Shopping");
    }

}
