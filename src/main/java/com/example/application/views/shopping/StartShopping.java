package com.example.application.views.shopping;

import com.example.application.views.MainLayout;
import com.vaadin.flow.component.Key;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.combobox.ComboBox;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.select.Select;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import org.vaadin.lineawesome.LineAwesomeIcon;

@PageTitle("Start Shopping")
@Route(value = "startShopping", layout = MainLayout.class)
public class StartShopping extends VerticalLayout {

    public StartShopping(){
        VerticalLayout todoList= new VerticalLayout();
        Select<String> select = new Select<>();
        select.setPlaceholder("Select a category");
        //select.setRenderer("cipolla" );
        select.setRequiredIndicatorVisible(true);
        select.setLabel("Select your select product");
        select.setItems();

        Button addButton = new Button("Add");
        addButton.addClickListener(e -> {
           // Checkbox checKBox = new Checkbox(taskField.getValue());
            todoList.add(select.getValue());
        });
        addButton.addClickShortcut(Key.ENTER);
        add(
                new H1("La tua lista:\n"),
                todoList,
                new HorizontalLayout(
                    select,
                    addButton
                )
        );
        //Image img = new Image("images/shopping.png", "Start Shopping");
    }

}
